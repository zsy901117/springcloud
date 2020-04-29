package com.sg.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sg.entity.User_role;
import com.sg.mapper.User_roleMapper;
import com.sg.service.IUser_roleService;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author zsy
 * @since 2019-05-26
 */
@Service
public class User_roleServiceImpl implements IUser_roleService {
	@Autowired
	private User_roleMapper user_rolemapper;

	/**
	 * 新增user_role
	 * 
	 * @param User_role信息
	 * 
	 */
	@Override
	public int insert(User_role user_role) {
		return user_rolemapper.insert(user_role);
	}

	/**
	 * 根据主键删除
	 * 
	 * @param ID
	 * @return 结果
	 */
	@Override
	public int delete(String user_id) {
		return user_rolemapper.deleteByUserId(user_id);
	}

	/**
	 * 根据主键批量删除
	 * 
	 * @param ID数组
	 * @return 结果
	 */
	@Override
	public int deleteList(List<User_role> urs) {
		return user_rolemapper.deleteList(urs);
	}

	/**
	 * 修改user_role
	 * 
	 * @param User_role
	 *            信息
	 * @return 结果
	 */
	@Override
	public int update(User_role user_role) {
		return user_rolemapper.update(user_role);
	}

	/**
	 * 根据主键查询信息
	 * 
	 * @param ID
	 * @return 结果
	 */
	@Override
	public User_role selectOne(User_role user_role) {
		return user_rolemapper.selectOne(user_role);
	}

	/**
	 * 条件查询User_role集合
	 * 
	 * @param ID
	 * @return 结果
	 */
	@Override
	public List<User_role> selectByUserId(String user_id) {
		return user_rolemapper.selectByUserId(user_id);
	}
}
