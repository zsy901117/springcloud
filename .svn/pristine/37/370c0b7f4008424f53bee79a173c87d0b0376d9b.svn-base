package com.sg.service.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.sg.entity.Menu;
import com.sg.entity.Role;
import com.sg.entity.Role_menu;
import com.sg.mapper.MenuMapper;
import com.sg.mapper.RoleMapper;
import com.sg.mapper.Role_menuMapper;
import com.sg.mapper.User_roleMapper;
import com.sg.query.RoleQuery;
import com.sg.service.IRoleService;
import com.sg.util.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author zsy
 * @since 2019-05-26
 */
@Service
public class RoleServiceImpl implements IRoleService {
	@Autowired
	private RoleMapper rolemapper;
	@Autowired
	private User_roleMapper urmapper;
	@Autowired
	private Role_menuMapper rmMapper;

	@Autowired
	private MenuMapper menuMapper;

	/**
	 * 分页查询
	 */
	public RoleQuery page(RoleQuery query) {
		query.setOptimizeCountSql(false);
		int total = rolemapper.roleCount();
		query.setTotal(total);
		rolemapper.pageRoleByQuery(query);
		return query;
	}

	/**
	 * 新增role
	 * 
	 * @param role
	 * 
	 */
	@Override
	public int insert(Role role) {
		String roleid = UUIDUtil.getUUID();
		role.setRole_id(roleid);
		int insertrole = rolemapper.insert(role);
		List<String> menuids = role.getMenuids();
		int insertmenu = 0;
		if (menuids != null) {
			for (String menuid : menuids) {
				Role_menu rm = new Role_menu();
				rm.setRole_id(roleid);
				rm.setAuth_id(menuid);
				insertmenu = rmMapper.insert(rm);
			}
		}
		return insertmenu + insertrole;
	}

	/**
	 * 根据主键删除
	 * 
	 * @param role_id
	 * @return 结果
	 */
	@Override
	public int deleteById(String role_id) {
		int deletemenu = rmMapper.deleteByRoleId(role_id);
		int deleteByRoleId = urmapper.deleteByRoleId(role_id);
		Role role = new Role();
		role.setRole_id(role_id);
		role.setDel_flag("1");
		int deleterole = rolemapper.update(role);
		return deleterole + deletemenu + deleteByRoleId;
	}

	/**
	 * 根据主键批量删除
	 * 
	 * @param ID数组
	 * @return 结果
	 */
	@Override
	public int deleteByIds(String[] ids) {
		return rolemapper.deleteByIds(ids);
	}

	/**
	 * 修改role
	 * 
	 * @param Role 信息
	 * @return 结果
	 */
	@Override
	public int update(Role role) {
		int update = rolemapper.update(role);
		int deletemenu = rmMapper.deleteByRoleId(role.getRole_id());
		List<String> menuids = role.getMenuids();
		int insertmenu = 0;
		if (menuids != null) {
			for (String menuid : menuids) {
				Role_menu rm = new Role_menu();
				rm.setRole_id(role.getRole_id());
				rm.setAuth_id(menuid);
				insertmenu = rmMapper.insert(rm);
			}
		}
		return update + deletemenu + insertmenu;
	}

	/**
	 * 根据主键查询信息
	 * 
	 * @param ID
	 * @return 结果
	 */
	@Override
	public Role selectById(String ID) {
		Role role = rolemapper.selectById(ID);
		List<Role_menu> rms = rmMapper.selectByRoleId(ID);
		List<String> menuids = new ArrayList<String>();
		if (rms != null) {
			for (Role_menu rm : rms) {
				String auth_id = rm.getAuth_id();
				menuids.add(auth_id);
			}
		}
		role.setMenuids(menuids);
		return role;
	}

	/**
	 * 条件查询Role集合
	 * 
	 * @param ID
	 * @return 结果
	 */
	@Override
	public List<Role> selectList(Role role) {
		return rolemapper.selectList(role);
	}

	/**
	 * 查询所有可用角色
	 * 
	 * @return
	 */
	public List<Role> getAll() {
		Role role = new Role();
		role.setDel_flag("0");
		return rolemapper.selectList(role);
	}

	/**
	 * 校验角色名
	 * 
	 * @param role_name
	 * @return
	 */
	public int checkrole(String role_code) {
		return rolemapper.checkrole(role_code);
	}

	/**
	 * 根据角色码集合查询菜单集合
	 */
	public Set<Menu> selectByRoleIds(List<String> roleids) {
		Set<Menu> menus = new HashSet<Menu>();
		if (roleids != null) {
			List<Role_menu> rolemenus = new ArrayList<Role_menu>();
			for (String roleid : roleids) {
				List<Role_menu> rms = rmMapper.selectByRoleId(roleid);
				rolemenus.addAll(rms);
			}
			if (rolemenus != null) {
				for (Role_menu rm : rolemenus) {
					Menu menu = menuMapper.selectById(rm.getAuth_id());
					menus.add(menu);
				}
			}
		}
		return menus;

	}
}
