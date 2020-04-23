package com.Rakesh.Cart.Config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Config {

	@Bean
	public RestOperations createRestTemp(ClientHttpRequestFactory cHttpRF) {
		return new RestTemplate(cHttpRF);
	}
	
	@Bean
	public ClientHttpRequestFactory createCHRF(@Value("${connect.timeout}") int cTimeOut, @Value("${read.timeout}") int rTimeOut) {
		HttpComponentsClientHttpRequestFactory httpChttpRF = new HttpComponentsClientHttpRequestFactory();
		httpChttpRF.setReadTimeout(rTimeOut);
		httpChttpRF.setConnectTimeout(cTimeOut);
		return httpChttpRF;
	}
}