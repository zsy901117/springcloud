package com.sg.util;

import org.springframework.security.core.context.SecurityContextHolder;

public class UserUtils {

	// 获取当前请求的用户Id
	public static String getCurrentPrinciple() {
		return (String) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
	}

}
