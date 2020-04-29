package com.sg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sg.entity.Role;
import com.sg.query.RoleQuery;
import com.sg.service.impl.RoleServiceImpl;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author zsy
 * @since 2019-05-26
 */
@RestController
@RequestMapping("/role")
@Api(value = "角色控制器")
public class RoleController {

	@Autowired
	private RoleServiceImpl roleservice;

	/**
	 * 分页查询
	 * 
	 * @param query
	 * @return
	 */

	@PostMapping("/page")
	@ApiOperation(value = "角色分页查询")
	@ApiImplicitParams({
		@ApiImplicitParam(value = "令牌", name = "access_token", dataType = "String", required = true,paramType = "query"),
	})
	public RoleQuery page(RoleQuery query) {
		return roleservice.page(query);

	}

	/**
	 * 获取所有可用角色
	 * 
	 * @return
	 */
	@GetMapping("/allRole")
	@ApiOperation(value = "查询所有角色")
	@ApiImplicitParams({
		@ApiImplicitParam(value = "令牌", name = "access_token", dataType = "String", required = true,paramType = "query"),
	})
	public List<Role> getAll() {
		return roleservice.getAll();
	}

	/**
	 * 根据主键查询信息
	 * 
	 * @param ID
	 * @return 结果
	 */
	@GetMapping("/id")
	@ApiOperation(value = "根据主键查询角色信息")
	@ApiImplicitParams({
		@ApiImplicitParam(value = "令牌", name = "access_token", dataType = "String", required = true,paramType = "query"),
		@ApiImplicitParam(value = "主键",name = "id",required = true,dataType = "String",paramType = "query")
	})
	public Role findOne(@RequestParam String id) {
		return roleservice.selectById(id);
	}

	@GetMapping("/checkrole")
	@ApiOperation(value = "根据角色编码查询角色数量")
	@ApiImplicitParams({
		@ApiImplicitParam(value = "令牌", name = "access_token", dataType = "String", required = true,paramType = "query"),
		@ApiImplicitParam(value = "角色编码",name = "role_code",required = true,dataType = "String",paramType = "query")
	})
	public int checkrole(String role_code) {
		return roleservice.checkrole(role_code);
	}

	/**
	 * 新增role
	 * 
	 * @param Role信息
	 * 
	 */
	@PostMapping("/add")
	@ApiOperation(value = "添加角色")
	@ApiImplicitParams({
		@ApiImplicitParam(value = "令牌", name = "access_token", dataType = "String", required = true,paramType = "query"),
		@ApiImplicitParam(value = "角色实体类", name = "role", dataType = "Role", required = true),
	})
	public int add(@RequestBody Role role) {
		return roleservice.insert(role);
	}

	/**
	 * 修改role
	 * 
	 * @param role 信息
	 * @return 结果
	 */
	@PostMapping("/update")
	@ApiOperation(value = "修改角色信息")
	@ApiImplicitParams({
		@ApiImplicitParam(value = "令牌", name = "access_token", dataType = "String", required = true,paramType = "query"),
		@ApiImplicitParam(value = "角色实体类", name = "role", dataType = "Role", required = true),
	})
	public int update(@RequestBody Role role) {
		return roleservice.update(role);
	}

	/**
	 * 根据主键删除
	 * 
	 * @param ID
	 * @return 结果
	 */
	@PostMapping("/deleteById")
	@ApiOperation(value = "根据主键删除角色信息")
	@ApiImplicitParams({
		@ApiImplicitParam(value = "令牌", name = "access_token", dataType = "String", required = true,paramType = "query"),
		@ApiImplicitParam(value = "主键",name = "id",required = true,dataType = "String",paramType = "query")
	})
	public int deleteOne(@RequestParam String id) {
		return roleservice.deleteById(id);
	}

}
