package com.Application.demo.filters;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;

public class APIFilter implements Filter{
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		HttpServletRequest req = (HttpServletRequest) request;
		
		String uri = req.getRequestURI();
		
		if(!uri.startsWith("/api/")) {
			chain.doFilter(request, response);
			return;
		}
		
		if(uri.equals("/api/msg1")) {
			System.out.println("/api/msg1 allowed without checks");
			chain.doFilter(request, response);
			return;
		}
		
		System.out.println("Validating request for " + uri);
		
		String token = req.getHeader("token");
		
		if("123".equals(token)) {
			req.setAttribute("checked", "TRUE");
		}
		else {
			req.setAttribute("checked", "FALSE");
		}
		
		chain.doFilter(request, response);
	}
}
