package com.mystyle.fillter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

@Component
public class RouterFilter extends ZuulFilter {
	
	private static Logger logger=LoggerFactory.getLogger(RouterFilter.class);

	@Override
	public boolean shouldFilter() {
		

		return true;
	}

	@Override
	public Object run() throws ZuulException {
	
		RequestContext requestContext=RequestContext.getCurrentContext();

		HttpServletRequest request=requestContext.getRequest();
		
		logger.info("RouterFillter "+String.format(" %s Reuest from to Filter URL %s",request.getMethod(),request.getRequestURI().toString()));
		
		return null;
	
	}

	@Override
	public String filterType() {

		return "router";
	}

	@Override
	public int filterOrder() {
	
		return 1;
	}


}
