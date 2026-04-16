package com.themaj.shopsphereproductservice.client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "user-service", url = "http://localhost:8180")
public interface UserClient {
}
