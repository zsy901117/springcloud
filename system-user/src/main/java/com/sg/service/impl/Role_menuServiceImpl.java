package com.sg.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sg.entity.Role_menu;
import com.sg.mapper.Role_menuMapper;
import com.sg.service.IRole_menuService;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author zsy
 * @since 2019-05-26
 */
@Service
public class Role_menuServiceImpl implements IRole_menuService {
	@Autowired
	private Role_menuMapper role_menumapper;

	/**
	 * 新增role_menu
	 * 
	 * @param Role_menu信息
	 * 
	 */
	@Override
	public int insert(Role_menu Role_menu) {
		return role_menumapper.insert(Role_menu);
	}

	/**
	 * 根据主键删除
	 * 
	 * @param ID
	 * @return 结果
	 */
	@Override
	public int deleteByRoleId(String role_id) {
		return role_menumapper.deleteByRoleId(role_id);
	}

	/**
	 * 根据主键查询信息
	 * 
	 * @param ID
	 * @return 结果
	 */
	@Override
	public Role_menu selectOne(Role_menu rm) {
		return role_menumapper.selectOne(rm);
	}

	/**
	 * 条件查询Role_menu集合
	 * 
	 * @param ID
	 * @return 结果
	 */
	@Override
	public List<Role_menu> selectByRoleId(String role_id) {
		return role_menumapper.selectByRoleId(role_id);
	}
}
