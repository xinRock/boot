package com.filter;

import com.app.SpringbootApplicationStarter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Created by menggq on 2019-08-14.
 */
@WebFilter(filterName="testFilter",urlPatterns="/socket")
public class FirstFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

        System.out.println("FirstFilter init....");

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("servlet执行之前=========");
        //正常调用servlet的方法
        filterChain.doFilter(servletRequest, servletResponse);

        System.out.println("servlet执行之后============");

    }

    @Override
    public void destroy() {

        System.out.println("FirstFilter destroy....");

    }
}
