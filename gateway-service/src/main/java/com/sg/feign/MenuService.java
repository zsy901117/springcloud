package com.sg.feign;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sg.entity.Menu;
import com.sg.feign.fallback.MenuServiceHystrix;

@FeignClient(value = "system-user", fallback = MenuServiceHystrix.class)
public interface MenuService {
	@RequestMapping(value = "/user/resource" ,method = RequestMethod.POST)
	public List<Menu> resource(@RequestParam(value="username") String username);
}
