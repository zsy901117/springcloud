package com.sg.feignclient;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

import com.sg.entity.JWT;
import com.sg.feignclient.hystrix.AuthServiceHystrix;

@FeignClient(value = "auth-service", fallback = AuthServiceHystrix.class)
public interface AuthServiceClient {
	@PostMapping(value = "/oauth/token")
	JWT getToken(@RequestHeader(value = "Authorization") String authorization, @RequestParam("grant_type") String type,
			@RequestParam("username") String username, @RequestParam("password") String password);

}