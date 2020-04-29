package com.sg.service;

import java.util.List;

import com.sg.entity.Menu;
/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zsy
 * @since 2019-05-26
 */

public interface IMenuService  {
  /**
     * 新增menu
     * 
     * @param Menu信息
     * 
     */
  public int insert(Menu Menu);

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
     * 修改menu
     * 
     * @param Menu 信息
     * @return 结果
     */
	public int update(Menu Menu);
	/**
     * 根据主键查询信息
     * 
     * @param ID
     * @return 结果
     */
	public Menu selectById(String ID);
	/**
     * 条件查询Menu集合
     * 
     * @param ID
     * @return 结果
     */
	public List<Menu> selectList(Menu Menu);
}

