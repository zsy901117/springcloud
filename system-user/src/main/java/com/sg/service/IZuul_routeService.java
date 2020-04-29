package com.sg.service;

import java.util.List;

import com.sg.entity.Zuul_route;
import com.sg.query.RouteQuery;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author zsy
 * @since 2019-06-11
 */

public interface IZuul_routeService {
	/**
	 * 新增zuul_route
	 * 
	 * @param Zuul_route信息
	 * 
	 */
	public int insert(Zuul_route Zuul_route);

	/**
	 * 根据主键删除
	 * 
	 * @param ID
	 * @return 结果
	 */
	public int delete(String ID);

	/**
	 * 根据主键批量删除
	 * 
	 * @param ID数组
	 * @return 结果
	 */
	public int deleteByIds(String[] ids);

	/**
	 * 修改zuul_route
	 * 
	 * @param Zuul_route 信息
	 * @return 结果
	 */
	public int update(Zuul_route Zuul_route);

	/**
	 * 根据主键查询信息
	 * 
	 * @param ID
	 * @return 结果
	 */
	public Zuul_route selectById(String ID);
   /**
    * 分页查询
    * @param query
    * @return
    */
	public RouteQuery page(RouteQuery query);

	/**
	 * 条件查询Zuul_route集合
	 * 
	 * @param ID
	 * @return 结果
	 */
	public List<Zuul_route> selectList(Zuul_route Zuul_route);
}
