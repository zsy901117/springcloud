package com.sg.query;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.sg.entity.Role;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@ApiModel(value="角色分页查询")
public class RoleQuery extends Page<Role> {
	@ApiModelProperty(value="角色编码")
	private String role_code;
	@ApiModelProperty(value="角色名称")
	private String role_name;

	public String getRole_code() {
		return role_code;
	}

	public void setRole_code(String role_code) {
		this.role_code = role_code;
	}

	public String getRole_name() {
		return role_name;
	}

	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}

	@Override
	public String toString() {
		return "RoleQuery [role_code=" + role_code + ", role_name=" + role_name + "]";
	}

	
}
