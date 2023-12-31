package com.simplilearn.spring.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;

@Component
public class LoggingFilter implements GlobalFilter {

    final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain){
		
        /* Authentication and Authorization can be implemented here */
		logger.info("Path of the request recieved -> {}", exchange.getRequest());
		
		return chain.filter(exchange);
	}

	
	
}
