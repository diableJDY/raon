package com.raon.core.auth;

import com.raon.core.domain.login.Member;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Slf4j
public class AuthProvider implements AuthenticationProvider {

    @Autowired
    AuthService service;
    private PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String userId = authentication.getName();
        String userPw = authentication.getCredentials().toString();
        return authenticate(userId, userPw);
    }

    private Authentication authenticate(String id, String pw) throws AuthenticationException {
        log.info("======================= private authenticate =======================");
        log.debug("authenticate with {}, {}", id, pw);
        Member m = new Member();
        m = service.login(id,pw);
        if ( m == null || !passwordEncoder.matches(pw, m.getPw())) {
            log.error("{} is not exist or password is not equals", id);
            return null;
        }
        List<GrantedAuthority> authList = new ArrayList<>();
        /**
         * Role 처리 필요, 일단 임의로 USER Role을 부여한다.
         **/

        authList.add(new SimpleGrantedAuthority("ROLE_USER"));

        return new MyAuthentication(id, pw, authList, m);

    }

    @Override
    public boolean supports(Class<?> authentication) {
        return (UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication));
    }
}