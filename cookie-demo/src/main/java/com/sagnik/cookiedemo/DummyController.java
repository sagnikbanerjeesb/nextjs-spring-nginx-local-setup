package com.sagnik.cookiedemo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.net.URI;
import java.util.Arrays;

@RestController
public class DummyController {
    @GetMapping("/hello")
    public ResponseEntity hello(HttpServletResponse servletResponse, HttpServletRequest servletRequest) {
//        if (servletRequest.getCookies() != null) {
//            System.out.println("Cookies: " + Arrays.stream(servletRequest.getCookies()).map(cookie -> cookie.getName() + ":" + cookie.getValue()).reduce((a, b) -> a + " ; " + b).orElse(""));
//        } else {
//            System.out.println("No cookies");
//        }
//
//        final Cookie cookie = new Cookie("dummy", "hello" + System.currentTimeMillis());
//        cookie.setPath("/");
//        servletResponse.addCookie(cookie);
//
//        return "hello";

        return ResponseEntity.status(HttpStatus.TEMPORARY_REDIRECT)
                .location(URI.create("http://localhost:8000/base/a/hello"))
                .build();
    }
}
