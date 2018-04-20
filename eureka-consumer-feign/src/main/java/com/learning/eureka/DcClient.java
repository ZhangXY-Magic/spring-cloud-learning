package com.learning.eureka;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("eureka-client") // 通过@FeignClient注解声明需要依赖的服务借口
public interface DcClient {
	
	@GetMapping("/dc")
	String consumer();
	
}
