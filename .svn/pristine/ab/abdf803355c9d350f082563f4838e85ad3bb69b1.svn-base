package com.sg.mapper;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.sg.entity.User;
import com.sg.query.UserQuery;

/**
 * <p>
 * Mapper 接口
 * </p>
 * 
 * @author zsy
 * @since 2019-05-26
 */
public interface UserMapper extends BaseMapper<User> {

	/**
	 * 新增user
	 * 
	 * @param User信息
	 * 
	 */
	public int insert(User user);

	/**
	 * 根据主键删除
	 * 
	 * @param user_id
	 * @return 结果
	 */
	public int deleteById(String id);

	/**
	 * 根据主键批量删除
	 * 
	 * @param user_id数组
	 * @return 结果
	 */
	public int deleteByIds(String[] ids);

	/**
	 * 修改user
	 * 
	 * @param User 信息
	 * @return 结果
	 */
	public int update(User user);

	/**
	 * 根据主键查询信息
	 * 
	 * @param user_id
	 * @return 结果
	 */
	public User selectById(String user_id);

	/**
	 * 根据用户名查询信息
	 * 
	 * @param user_id
	 * @return 结果
	 */
	public User selectByName(String username);
	/**
	 * 统计该用户名的数量
	 * @param username
	 * @return
	 */
	public int checkUser(String username);

	/**
	 * 条件查询User集合
	 * 
	 * @param user_id
	 * @return 结果
	 */
	public List<User> selectList(User user);

	/**
	 * 统计
	 */
	public int userCount();

	/**
	 * 分页查询
	 */
	IPage<User> pageUserByQuery(UserQuery query);
}
