package com.mystyle.fillter;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

@Component
public class ErrorFilter extends ZuulFilter {
	
	private static Logger log=LoggerFactory.getLogger(PostFilter.class);
	
	
	@Override
	public boolean shouldFilter() {
	
		return false;
	}

	@Override
	public Object run() throws ZuulException {
	
		HttpServletResponse response=RequestContext.getCurrentContext().getResponse();
		
		log.info("ERRORFillter "+String.format("reponse status %d",response.getStatus()));
		
		return null;
	}

	@Override
	public String filterType() {
		
		return "error";
	}

	@Override
	public int filterOrder() {
	
		
		return 1;
	}

}
