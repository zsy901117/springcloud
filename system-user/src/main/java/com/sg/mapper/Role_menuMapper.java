package com.sg.mapper;

import java.util.List;

import com.sg.entity.Role_menu;

/**
 * <p>
 * Mapper 接口
 * </p>
 * 
 * @author zsy
 * @since 2019-05-26
 */
public interface Role_menuMapper {

	/**
	 * 新增role_menu
	 * 
	 * @param Role_menu信息
	 * 
	 */
	public int insert(Role_menu rm);

	/**
	 * 根据角色主键删除
	 * 
	 * @param ID
	 * @return 结果
	 */
	public int deleteByRoleId(String role_id);
	/**
	 * 根据菜单主键删除
	 * @param auth_id
	 * @return
	 */
    public int deleteByMenuId(String auth_id);
	/**
	 * 根据主键查询信息
	 * 
	 * @param ID
	 * @return 结果
	 */
	public Role_menu selectOne(Role_menu rm);

	/**
	 * 条件查询Role_menu集合
	 * 
	 * @param ID
	 * @return 结果
	 */
	public List<Role_menu> selectByRoleId(String role_id);
}
