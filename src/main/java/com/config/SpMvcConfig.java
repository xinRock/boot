package com.config;

import com.filter.FirstFilter;
import com.listener.FirstListener;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.servlet.Testservlet;
/**
 * 也可以编写EmbeddedServletContainerCustomizer:嵌入式的Servlet容器的定制器
 * @author menggq
 * Component 与 Configuration功能相似，Configuration注解得底层就是Component
 *
 */
@Configuration
public class SpMvcConfig {

	@Bean
	public ServletRegistrationBean servletRegistrationBean(){
		ServletRegistrationBean registrationBean = new ServletRegistrationBean(new Testservlet(),"/socket");
		registrationBean.setName("testservlet");
		return registrationBean;
	}

	@Bean
	public FilterRegistrationBean getFilterRegistrationBean() {
		FilterRegistrationBean bean = new FilterRegistrationBean(new FirstFilter());
		bean.setName("testFilter");
		bean.addUrlPatterns("/socket");
		return bean;
	}

	@Bean
	public ServletListenerRegistrationBean<FirstListener> getFirstListenerBean(){
		ServletListenerRegistrationBean<FirstListener> bean = new ServletListenerRegistrationBean<FirstListener>(new FirstListener());
		return bean;
	}
}
