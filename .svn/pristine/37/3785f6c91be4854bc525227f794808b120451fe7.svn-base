package com.sg.mapper;

import com.sg.entity.Zuul_route;
import com.sg.query.RouteQuery;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 * 
 * @author zsy
 * @since 2019-06-11
 */
public interface Zuul_routeMapper {

	/**
	 * 新增zuul_route
	 * 
	 * @param Zuul_route信息
	 * 
	 */
	public int insert(Zuul_route zuul_route);

	/**
	 * 根据主键删除
	 * 
	 * @param ID
	 * @return 结果
	 */
	public int deleteById(String id);

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
	public int update(Zuul_route zuul_route);

	/**
	 * 根据主键查询信息
	 * 
	 * @param ID
	 * @return 结果
	 */
	public Zuul_route selectById(String id);

	/**
	 * 分页查询
	 * 
	 * @param query
	 * @return
	 */
	public IPage<Zuul_route> page(RouteQuery query);
   /**
    * 统计信息
    * @return
    */
	public int routeCount();

	/**
	 * 条件查询Zuul_route集合
	 * 
	 * @param ID
	 * @return 结果
	 */
	public List<Zuul_route> selectList(Zuul_route zuul_route);
}
