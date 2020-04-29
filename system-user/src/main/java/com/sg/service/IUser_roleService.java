package com.sg.service;

import java.util.List;

import com.sg.entity.User_role;
/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zsy
 * @since 2019-05-26
 */

public interface IUser_roleService  {
  /**
     * 新增user_role
     * 
     * @param User_role信息
     * 
     */
  public int insert(User_role user_role);

    /**
     * 根据主键删除
     * 
     * @param ID
     * @return 结果
     */
  public int delete(String user_id);
     /**
     * 根据主键批量删除
     * @param ID数组
     * @return 结果
     */
   public int deleteList(List<User_role> urs);

     /**
     * 修改user_role
     * 
     * @param User_role 信息
     * @return 结果
     */
	public int update(User_role user_role);
	/**
     * 根据主键查询信息
     * 
     * @param ID
     * @return 结果
     */
	public User_role selectOne(User_role user_role);
	/**
     * 条件查询User_role集合
     * 
     * @param ID
     * @return 结果
     */
	public List<User_role> selectByUserId(String user_id);
}

