package com.sg.mapper;

import java.util.List;

import com.sg.entity.Menu;

/**
 * <p>
 * Mapper 接口
 * </p>
 * 
 * @author zsy
 * @since 2019-05-26
 */
public interface MenuMapper {

	/**
	 * 新增menu
	 * 
	 * @param Menu信息
	 * 
	 */
	public int insert(Menu menu);

	/**
	 * 根据主键删除
	 * 
	 * @param auth_id
	 * @return 结果
	 */
	public int deleteById(String auth_id);

	/**
	 * 根据主键批量删除
	 * 
	 * @param auth_id数组
	 * @return 结果
	 */
	public int deleteByIds(String[] ids);

	/**
	 * 修改menu
	 * 
	 * @param Menu
	 *            信息
	 * @return 结果
	 */
	public int update(Menu menu);

	/**
	 * 根据主键查询信息
	 * 
	 * @param auth_id
	 * @return 结果
	 */
	public Menu selectById(String auth_id);

	/**
	 * 条件查询Menu集合
	 * 
	 * @param auth_id
	 * @return 结果
	 */
	public List<Menu> selectList(Menu menu);
   
	/**
	 * 根据url查询Menu集合
	 * 
	 * @param auth_id
	 * @return 结果
	 */
	public Menu selectByUrl(String url);
	/**
	 *  查询下级菜单id
	 * @param parent_id
	 * @return
	 */
	public List<String> selectByParentId(String parent_id);
	/**
	 *统计
	 */
	public int menuCount();
}
