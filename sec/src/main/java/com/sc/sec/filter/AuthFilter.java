package com.sc.sec.filter;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
@WebFilter(urlPatterns = "/**")
@Component
public class AuthFilter  implements Filter {
    private static  final Logger logger = LoggerFactory.getLogger(AuthFilter.class);
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    logger.info("beign init authFilter");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
       logger.info("param:{}", JSONObject.toJSONString(request.getParameterMap()));
       filterChain.doFilter(request,servletResponse);
    }

    @Override
    public void destroy() {
    logger.info("begin destory authFilter");
    }
}
