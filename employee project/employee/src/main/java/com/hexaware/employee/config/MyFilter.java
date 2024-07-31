//package com.hexaware.employee.config;
//
//import jakarta.servlet.Filter;
//import jakarta.servlet.FilterChain;
//import jakarta.servlet.FilterConfig;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.ServletRequest;
//import jakarta.servlet.ServletResponse;
//import org.springframework.stereotype.Component;
//
//
//import java.io.IOException;
//@Component
//public class MyFilter implements Filter {
//    @Override
//    public void init(FilterConfig filterConfig) throws ServletException {
//
//    }
//
//    @Override
//    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//        System.out.println("MyFilter");
//        System.out.println("Remote Host:" + servletRequest.getRemoteHost());
//        System.out.println("Remote Address:" + servletRequest.getRemoteAddr());
//        filterChain.doFilter(servletRequest, servletResponse);
//    }
//
//
//    @Override
//    public void destroy() {
//
//    }
//}