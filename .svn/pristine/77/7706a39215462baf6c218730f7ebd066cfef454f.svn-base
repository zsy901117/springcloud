package com.sg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sg.dto.MenuTree;
import com.sg.entity.Menu;
import com.sg.service.impl.MenuServiceImpl;
import com.sg.service.impl.UserServiceImpl;
import com.sg.util.UserUtils;

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
@RequestMapping("/menu")
@Api(value = "菜单控制器")
public class MenuController {

	@Autowired
	private MenuServiceImpl menuservice;

	@Autowired
	private UserServiceImpl userservice;

	/**
	 * 根据主键查询信息
	 * 
	 * @param ID
	 * @return 结果
	 */
	@GetMapping("/id")
	@ApiOperation(value = "根据主键查询菜单")
	@ApiImplicitParams({
		@ApiImplicitParam(value = "令牌", name = "access_token", dataType = "String", required = true,paramType = "query"),
		@ApiImplicitParam(value = "主键",name = "id",required = true,dataType = "String",paramType = "query")
	})
	public Menu findOne(@RequestParam String id) {
		return menuservice.selectById(id);
	}

	/**
	 * 新增menu
	 * 
	 * @param Menu信息
	 * 
	 */
	@PostMapping("/add")
	@ApiOperation(value = "添加菜单")
	@ApiImplicitParams({
		@ApiImplicitParam(value = "令牌", name = "access_token", dataType = "String", required = true,paramType = "query"),
		@ApiImplicitParam(value = "菜单实体类", name = "menu", dataType = "Menu", required = true),
	})
	public int add(@RequestBody Menu menu) {
		return menuservice.insert(menu);
	}

	/**
	 * 修改menu
	 * 
	 * @param Menu 信息
	 * @return 结果
	 */
	@PostMapping("/update")
	@ApiOperation(value = "修改菜单信息")
	@ApiImplicitParams({
		@ApiImplicitParam(value = "令牌", name = "access_token", dataType = "String", required = true,paramType = "query"),
		@ApiImplicitParam(value = "菜单实体类", name = "menu", dataType = "Menu", required = true),
	})
	public int update(@RequestBody Menu menu) {
		return menuservice.update(menu);
	}

	/**
	 * 根据主键删除
	 * 
	 * @param ID
	 * @return 结果
	 */
	@PostMapping("/deleteById")
	@ApiOperation(value = "根据主键删除菜单")
	@ApiImplicitParams({
		@ApiImplicitParam(value = "令牌", name = "access_token", dataType = "String", required = true,paramType = "query"),
		@ApiImplicitParam(value = "主键",name = "id",required = true,dataType = "String",paramType = "query")
	})
	public int deleteOne(String id) {
		return menuservice.deleteById(id);
	}
    /**
          * 根据token获取菜单
     * @return
     */
	@GetMapping("/tree")
	@ApiOperation(value = "根据token获取权限菜单集合")
	@ApiImplicitParams({
		@ApiImplicitParam(value = "令牌", name = "access_token", dataType = "String", required = true,paramType = "query"),
	})
	public List<MenuTree> findByRoles() {
		String username = UserUtils.getCurrentPrinciple();
		List<String> roleids = userservice.getRoleIds(username);
		return menuservice.getMenuTreeByRoleIds(roleids);
	}
    /**
     *  获取所有未删除菜单
     * @return
     */
	@GetMapping("/alltree")
	@ApiOperation(value = "获取所有菜单")
	@ApiImplicitParams({
		@ApiImplicitParam(value = "令牌", name = "access_token", dataType = "String", required = true,paramType = "query"),
	})
	public List<MenuTree> getAllTree() {
		return menuservice.getAllMenuTree();
	}
}
