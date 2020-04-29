package com.sg.service;

import java.util.List;

import com.sg.entity.Role;
/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zsy
 * @since 2019-05-26
 */

public interface IRoleService  {
  /**
     * 新增role
     * 
     * @param Role信息
     * 
     */
  public int insert(Role Role);

    /**
     * 根据主键删除
     * 
     * @param ID
     * @return 结果
     */
  public int deleteById(String ID);
     /**
     * 根据主键批量删除
     * @param ID数组
     * @return 结果
     */
   public int deleteByIds(String[] ids);

     /**
     * 修改role
     * 
     * @param Role 信息
     * @return 结果
     */
	public int update(Role Role);
	/**
     * 根据主键查询信息
     * 
     * @param ID
     * @return 结果
     */
	public Role selectById(String ID);
	/**
     * 条件查询Role集合
     * 
     * @param ID
     * @return 结果
     */
	public List<Role> selectList(Role Role);
}

