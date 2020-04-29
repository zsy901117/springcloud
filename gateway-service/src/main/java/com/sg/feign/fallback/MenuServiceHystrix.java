package com.sg.feign.fallback;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sg.entity.Menu;
import com.sg.feign.MenuService;

@Service
public class MenuServiceHystrix implements MenuService {

	@Override
	public List<Menu> resource(String username) {
		return Collections.emptyList();
	}

}
