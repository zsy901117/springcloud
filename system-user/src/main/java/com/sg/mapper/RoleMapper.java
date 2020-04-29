package com.sg.mapper;

import java.util.List;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.sg.entity.Role;
import com.sg.query.RoleQuery;

/**
 * <p>
 * Mapper 接口
 * </p>
 * 
 * @author zsy
 * @since 2019-05-26
 */
public interface RoleMapper {

	/**
	 * 新增role
	 * 
	 * @param role
	 * 
	 */
	public int insert(Role role);

	/**
	 * 根据主键删除
	 * 
	 * @param role_id
	 * @return 结果
	 */
	public int deleteById(String role_id);

	/**
	 * 根据主键批量删除
	 * 
	 * @param ids
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
	 * @param role_id
	 * @return 结果
	 */
	public Role selectById(String role_id);
    /**
          *  校验角色名
     * @param role_code
     * @return
     */
	public int checkrole(String role_code);
	/**
	 * 
	 * 根据角色编码查询角色
	 */
	public Role selectByRoleCode(String role_code);

	/**
	 * 条件查询Role集合
	 * 
	 * @param role
	 * @return 结果
	 */
	public List<Role> selectList(Role role);

	/**
	 * 统计
	 */
	public int roleCount();

	/**
	 * 分页查询
	 */
	IPage<Role> pageRoleByQuery(RoleQuery query);
}
