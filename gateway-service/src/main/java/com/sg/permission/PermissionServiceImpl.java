package com.sg.permission;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Service;
import org.springframework.util.AntPathMatcher;

import com.sg.entity.Menu;
import com.sg.feign.MenuService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service("permissionService")
public class PermissionServiceImpl {

	@Autowired
	private MenuService menuservice;

	private AntPathMatcher antPathMatcher = new AntPathMatcher();

	/**
	 * 判断请求是否有权限
	 *
	 * @param request        HttpServletRequest
	 * @param authentication 认证信息
	 * @return 是否有权限
	 */
	public boolean hasPermission(HttpServletRequest request, Authentication authentication) {
		Object principal = authentication.getPrincipal();
		Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();

		if (principal == null) {
			return false;
		}
		if (authorities == null || authorities.isEmpty()) {
			return false;
		}

		// 获取权限列表
		List<Menu> menus = new ArrayList<Menu>();
		for (GrantedAuthority authority : authorities) {
			String username = authority.getAuthority();
			List<Menu> ms = menuservice.resource(username);
			if (ms != null) {
				menus.addAll(ms);
			}
		}
		if (menus.size() > 0) {
			for (Menu menu : menus) {
				if (StringUtils.isNotBlank(menu.getUrl())
						&& antPathMatcher.match("/**"+menu.getUrl(),request.getRequestURI())
						&& request.getMethod().equalsIgnoreCase(menu.getMethod())) {
					return true;
				}
			}
		}

		return false;
	}
}
