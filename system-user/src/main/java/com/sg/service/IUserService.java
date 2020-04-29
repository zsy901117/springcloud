package com.sg.service;

import java.util.List;

import com.sg.entity.User;
/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zsy
 * @since 2019-05-26
 */

public interface IUserService  {
  /**
     * 新增user
     * 
     * @param User信息
     * 
     */
  public int insert(User User);

    /**
     * 根据主键删除
     * 
     * @param ID
     * @return 结果
     */
  public int delete(String ID);
     /**
     * 根据主键批量删除
     * @param ID数组
     * @return 结果
     */
   public int deleteByIds(String[] ids);

     /**
     * 修改user
     * 
     * @param User 信息
     * @return 结果
     */
	public int update(User User);
	/**
     * 根据主键查询信息
     * 
     * @param ID
     * @return 结果
     */
	public User selectById(String ID);
	/**
     * 条件查询User集合
     * 
     * @param ID
     * @return 结果
     */
	public List<User> selectList(User User);
}

