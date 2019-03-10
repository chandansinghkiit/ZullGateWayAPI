package com.mystyle.fillter;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

@Component
public class PostFilter extends ZuulFilter {
	
	private static Logger logger=LoggerFactory.getLogger(PostFilter.class);

	@Override
	public boolean shouldFilter() {
		
	
		return true;
	}

	@Override
	public Object run() throws ZuulException {
	
		return null;
		
		
		
		
	}

	@Override
	public String filterType() {

		return "post";
	}

	@Override
	public int filterOrder() {
	
		return 1;
	}

}
