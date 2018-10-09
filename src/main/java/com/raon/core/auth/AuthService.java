//package com.raon.core.auth;
//
//import com.raon.core.domain.login.Member;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.stereotype.Service;
//
//
//
//@Service
//public class AuthService {
//
//    //@Autowired
//    //MemberMapper mapper;
//
//    public Member login(String id, String pw) {
//        Member m = new Member();
////        m.setId(id);
////        m = mapper.getMember(m);
////        if ( m == null ) {
////            return null;
////        }
////        if ( !m.getPw().equals(pw) ) {
////            return null;
////        }
//
//        return m;
//    }
//
//    public static Member getCurrentUser() {
//        Authentication authentication = (Authentication) SecurityContextHolder.getContext().getAuthentication();
//        if (authentication instanceof MyAuthentication)
//            return ((MyAuthentication) authentication).getMember();
//        return null;
//    }
//
//    public static void setCurrentUser(Member member) {
//        ((MyAuthentication) SecurityContextHolder.getContext().getAuthentication()).setMember(member);
//    }
//
//}