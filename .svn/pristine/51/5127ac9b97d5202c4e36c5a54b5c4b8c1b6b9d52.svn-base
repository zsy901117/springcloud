package com.sg.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sg.entity.Zuul_route;
import com.sg.mapper.Zuul_routeMapper;
import com.sg.query.RouteQuery;
import com.sg.service.IZuul_routeService;
import com.sg.util.UUIDUtil;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author zsy
 * @since 2019-06-11
 */
@Service
public class Zuul_routeServiceImpl implements IZuul_routeService {
	@Autowired
	private Zuul_routeMapper zrmapper;

	/**
	 * 新增zuul_route
	 * 
	 * @param Zuul_route信息
	 * 
	 */
	@Override
	public int insert(Zuul_route zuul_route) {
		zuul_route.setId(UUIDUtil.getUUID());
		return zrmapper.insert(zuul_route);
	}

	/**
	 * 根据主键删除
	 * 
	 * @param ID
	 * @return 结果
	 */
	@Override
	public int delete(String id) {
		return zrmapper.deleteById(id);
	}

	/**
	 * 根据主键批量删除
	 * 
	 * @param ID数组
	 * @return 结果
	 */
	@Override
	public int deleteByIds(String[] ids) {
		return zrmapper.deleteByIds(ids);
	}

	/**
	 * 修改zuul_route
	 * 
	 * @param Zuul_route 信息
	 * @return 结果
	 */
	@Override
	public int update(Zuul_route zuul_route) {
		return zrmapper.update(zuul_route);
	}

	/**
	 * 根据主键查询信息
	 * 
	 * @param ID
	 * @return 结果
	 */
	@Override
	public Zuul_route selectById(String id) {
		return zrmapper.selectById(id);
	}

	/**
	 * 条件查询Zuul_route集合
	 * 
	 * @param ID
	 * @return 结果
	 */
	@Override
	public List<Zuul_route> selectList(Zuul_route zuul_route) {
		return zrmapper.selectList(zuul_route);
	}

	@Override
	public RouteQuery page(RouteQuery query) {
		query.setOptimizeCountSql(false);
		int total = zrmapper.routeCount();
		query.setTotal(total);
		zrmapper.page(query);
		return query;
	}
}
