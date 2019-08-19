package com.app;
/**
 * @SpringBootApplication是一个复合注解，
 * 包括@ComponentScan，@SpringBootConfiguration，@EnableAutoConfiguration
 */
import com.filter.FirstFilter;
import com.listener.FirstListener;
import com.servlet.Testservlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
//@EnableAutoConfiguration 

//@ServletComponentScan(basePackages = {"com.listener","com.filter"})
@ComponentScan(basePackages = {"com.config","com.controller"})
@SpringBootApplication
public class SpringbootApplicationStarter {

	public static ConfigurableApplicationContext run;
	public static void main(String[] args) {
		 run = SpringApplication.run(SpringbootApplicationStarter.class, args);
	}

	/*@Bean
	public ServletRegistrationBean servletRegistrationBean(){
		ServletRegistrationBean registrationBean = new ServletRegistrationBean(new Testservlet(),"/socket");
		registrationBean.setName("testservlet");
		return registrationBean;
	}*/

	/*@Bean
	public FilterRegistrationBean getFilterRegistrationBean() {
		FilterRegistrationBean bean = new FilterRegistrationBean(new FirstFilter());
		bean.setName("testFilter");
		bean.addUrlPatterns("/socket");
		return bean;
	}*/

	/*@Bean
	public ServletListenerRegistrationBean<FirstListener> getFirstListenerBean(){
		ServletListenerRegistrationBean<FirstListener> bean = new ServletListenerRegistrationBean<FirstListener>(new FirstListener());
		return bean;
	}*/
}
