package com.leaveword.config;

import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import java.io.IOException;

/**
 *
 * Config Servlet API
 * Equivalent to filter in the web.xml of SpringMVC
 *
 */
@Component
@ServletComponentScan
@WebFilter(urlPatterns = "/*", filterName = "sessionAndTraceRegistrationFilter",
        initParams = { @WebInitParam(name = "logFilterExecution", value = "true")})
public class KiekerConfig implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }
}
