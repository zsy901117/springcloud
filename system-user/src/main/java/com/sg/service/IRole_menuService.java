package com.sg.service;

import java.util.List;

import com.sg.entity.Role_menu;
/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zsy
 * @since 2019-05-26
 */

public interface IRole_menuService  {
  /**
     * 新增role_menu
     * 
     * @param Role_menu信息
     * 
     */
  public int insert(Role_menu rm);

    /**
     * 根据主键删除
     * 
     * @param ID
     * @return 结果
     */
  public int deleteByRoleId(String role_id);

	/**
     * 根据主键查询信息
     * 
     * @param ID
     * @return 结果
     */
	public Role_menu selectOne(Role_menu Role_menu);
	/**
     * 条件查询Role_menu集合
     * 
     * @param ID
     * @return 结果
     */
	public List<Role_menu> selectByRoleId(String role_id);
}

