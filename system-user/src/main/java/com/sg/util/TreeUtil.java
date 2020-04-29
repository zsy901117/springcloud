package com.sg.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.sg.dto.MenuTree;
import com.sg.entity.Menu;

public class TreeUtil {

	/**
	 * 数组转树形结构
	 * 
	 * @param Menus
	 * @param root
	 * @return
	 */
	public static List<MenuTree> listToTree(List<Menu> Menus, String root) {
		// 普通对象转树节点
		List<MenuTree> menuList = buildTree(Menus);
		List<MenuTree> trees = new ArrayList<>();
		for (MenuTree tree : menuList) {
			if (root.equals(tree.getParent_id())) {
				trees.add(tree);
			}
			for (MenuTree t : menuList) {
				if (tree.getAuth_id().equals(""+t.getParent_id())) {
					if (tree.getChildren() == null) {
						tree.setChildren(new ArrayList<MenuTree>());
					}
					tree.addChildren(t);
				}
			}
		}
		return trees;
	}

	/**
	 * 对象转树节点
	 * 
	 * @param Menus
	 * @return
	 */
	public static List<MenuTree> buildTree(List<Menu> Menus) {
		List<MenuTree> trees = new ArrayList<>();
		Menus.forEach(menu -> {
			MenuTree tree = new MenuTree();
			BeanUtils.copyProperties(menu, tree);
			trees.add(tree);
		});
		return trees;
	}
}
