package com.sg.mapper;

import java.util.List;

import com.sg.entity.User_role;

/**
 * <p>
 * Mapper 接口
 * </p>
 * 
 * @author zsy
 * @since 2019-05-26
 */
public interface User_roleMapper {

	/**
	 * 新增user_role
	 * 
	 * @param User_role信息
	 * 
	 */
	public int insert(User_role user_role);

	/**
	 * 根据用户主键删除
	 * 
	 * @param ID
	 * @return 结果
	 */
	public int deleteByUserId(String  user_id);
    /**
          * 根据角色主键删除
     * @param role_id
     * @return
     */
	public int deleteByRoleId(String role_id);
	/**
	 * 根据主键批量删除
	 * 
	 * @param ID数组
	 * @return 结果
	 */
	public int deleteList(List<User_role> urs);

	/**
	 * 修改user_role
	 * 
	 * @param User_role
	 *            信息
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
