package com.sg.service.impl;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sg.dto.MenuTree;
import com.sg.entity.Menu;
import com.sg.mapper.MenuMapper;
import com.sg.mapper.Role_menuMapper;
import com.sg.service.IMenuService;
import com.sg.util.TreeUtil;
import com.sg.util.UUIDUtil;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author zsy
 * @since 2019-05-26
 */
@Service
public class MenuServiceImpl implements IMenuService {
    @Autowired
    private MenuMapper menumapper;
    @Autowired
    private Role_menuMapper rmmapper;
    @Autowired
    private RoleServiceImpl roleService;

    public List<MenuTree> getAllMenuTree() {
        Menu menu = new Menu();
        menu.setDel_flag("0");
        List<Menu> menulist = menumapper.selectList(menu);
        List<Menu> allmenu = menulist.stream().sorted(Comparator.comparingInt(Menu::getSort)).collect(Collectors.toList());
        return TreeUtil.listToTree(allmenu, "-1");
    }

    public List<MenuTree> getMenuTreeByRoleIds(List<String> roleids) {
        Set<Menu> menus = roleService.selectByRoleIds(roleids);
        List<Menu> newmenus = new ArrayList<Menu>();
        for (Menu menu : menus) {
            if (menu.getMenu_type().equals("0")) {
                newmenus.add(menu);
            }
        }
        List<Menu> menutree = newmenus.stream().sorted(Comparator.comparingInt(Menu::getSort)).collect(Collectors.toList());
        return TreeUtil.listToTree(menutree, "-1");
    }

	/**
	 * 新增menu
	 * @param menu
	 * @return
	 */

	@Override
    public int insert(Menu menu) {
        menu.setAuth_id(UUIDUtil.getUUID());
        if (menu.getParent_id().equals("-1") && !menu.getPath().contains("/")) {
            menu.setPath("/" + menu.getPath());
        } else if (!menu.getParent_id().equals("-1")&&menu.getMenu_type().equals("0")) {
            menu.setPath(menu.getPath().replaceAll("/",""));
        }
        return menumapper.insert(menu);
    }

    /**
     * 根据主键删除
     *
     * @param id
     * @return 结果
     */
    @Override
    public int deleteById(String id) {
        int deleteByMenuId = rmmapper.deleteByMenuId(id);
        List<String> ids = menumapper.selectByParentId(id);
        if (ids != null) {
            for (String authid : ids) {
                deleteById(authid);
            }
        }
        Menu menu = new Menu();
        menu.setAuth_id(id);
        menu.setDel_flag("1");
        return menumapper.update(menu) + deleteByMenuId;
    }

    /**
     * 根据主键批量删除
     *
     * @param ids
     * @return 结果
     */
    @Override
    public int deleteByIds(String[] ids) {
        return menumapper.deleteByIds(ids);
    }

    /**
     * 修改menu
     *
     * @param Menu 信息
     * @return 结果
     */
    @Override
    public int update(Menu Menu) {
        return menumapper.update(Menu);
    }

    /**
     * 根据主键查询信息
     *
     * @param ID
     * @return 结果
     */
    @Override
    public Menu selectById(String ID) {
        return menumapper.selectById(ID);
    }

    /**
     * 条件查询Menu集合
     *
     * @param Menu
     * @return 结果
     */
    @Override
    public List<Menu> selectList(Menu Menu) {
        return menumapper.selectList(Menu);
    }

	/**
	 *
	 * @param url
	 * @return
	 */
    public Menu selectByUrl(String url) {
        return menumapper.selectByUrl(url);
    }
}
