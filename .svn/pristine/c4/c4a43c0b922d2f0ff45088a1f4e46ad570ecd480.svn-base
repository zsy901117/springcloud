package com.sg.query;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.sg.entity.User;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@ApiModel(value="用户分页查询")
public class UserQuery extends Page<User> {
	/**
	 * 用户名
	 */
	@ApiModelProperty(value="角色编码")
	private String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
