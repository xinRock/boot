package com.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.servlet.Testservlet;
/**
 * 也可以编写EmbeddedServletContainerCustomizer:嵌入式的Servlet容器的定制器
 * @author menggq
 *
 */
@Configuration
@Component
public class SpMvcConfig {

	@Bean
	public ServletRegistrationBean servletRegistrationBean(){
	    ServletRegistrationBean registrationBean = new ServletRegistrationBean(new Testservlet(),"/socket");
	    return registrationBean;
	}
	
}
