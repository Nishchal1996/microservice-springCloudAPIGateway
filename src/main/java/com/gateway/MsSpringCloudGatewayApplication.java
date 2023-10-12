package com.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import io.netty.resolver.DefaultAddressResolverGroup;
import reactor.netty.http.client.HttpClient;

@SpringBootApplication
public class MsSpringCloudGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsSpringCloudGatewayApplication.class, args);
	}
	
	@Bean
	public HttpClient httpClient() {
	    return HttpClient.create().resolver(DefaultAddressResolverGroup.INSTANCE);
	}

}
