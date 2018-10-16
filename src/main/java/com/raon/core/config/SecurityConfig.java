package com.raon.core.config;


import com.raon.core.auth.AuthProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;


@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    AuthProvider authProvider;

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/static/css/**, /static/js/**,/js/**,/css/**, *.ico");		// Resources 파일이나 Javascript 파일 경로 무시
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.csrf().disable();		// 개발 시 에만

        http.authorizeRequests()
                .antMatchers("/user/**").access("hasRole('ROLE_USER')")				// 사용자 페이지
                .antMatchers("/admin/**").access("hasRole('ROLE_ADMIN')")				// 관리자 페이지
                .antMatchers("/login").permitAll()
                .antMatchers("/movies").permitAll()
                .antMatchers("/aa").permitAll()
                .antMatchers("/api/**").permitAll()
                .antMatchers("/**").authenticated();

        http.formLogin()
                .loginPage("/login")
                .defaultSuccessUrl("/")
                .usernameParameter("id")
                .passwordParameter("password");

        http.logout()
                .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                .logoutSuccessUrl("/")
                .invalidateHttpSession(true);

        http.authenticationProvider(authProvider);

    }

}
