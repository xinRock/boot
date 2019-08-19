package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;

/**
 * @WebServlet(name="Testservlet",urlPatterns="/socket")
 * 注解方式 需要在启动类上添加@ServletComponentScan(basePackages = "com.servlet") 一个注解和加载到组件两个作用
 *
 */
@WebServlet(name="testservlet",urlPatterns="/socket")
public class Testservlet extends HttpServlet  {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("daowozhele");
		System.out.println("daowozhele");

		System.out.println("daowozhele");
		resp.getWriter().write("Hello MyServlet");

	}
	
}