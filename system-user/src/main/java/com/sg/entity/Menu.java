package com.sg.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.extension.activerecord.Model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author zsy
 * @since 2019-05-26
 */
@ApiModel(value = "菜单")
public class Menu extends Model<Menu> {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@ApiModelProperty(value = "菜单id")
	private String auth_id;

	/**
	 * 前端菜单名称
	 */
	private String menu_name;

	/**
	 * 类型0菜单1按钮
	 */
	private String menu_type;

	/**
	 * 父菜单ID
	 */
	private String parent_id;

	/**
	 * 后台访问地址
	 */
	private String url;

	/**
	 * 请求方式
	 */
	private String method;

	/**
	 * 前台访问路径
	 */
	private String path;

	/**
	 * 前台权限标识
	 */
	private String permission;

	/**
	 * 0显示1隐藏
	 */
	private String visible;
	/**
	 * 创建人
	 */
	private String createby;
	/**
	 * 图标
	 */
	private String icon;
	/**
	 * 组件路径
	 */
	private String component;
	/**
	 * 排序权重
	 */
	private int sort;
	/**
	 * 创建时间
	 */
	private String createtime;

	public String getCreateby() {
		return createby;
	}

	public void setCreateby(String createby) {
		this.createby = createby;
	}

	public String getCreatetime() {
		return createtime;
	}

	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}

	/**
	 * 删除标记
	 */
	private String del_flag;

	public String getAuth_id() {
		return auth_id;
	}

	public void setAuth_id(String auth_id) {
		this.auth_id = auth_id;
	}

	public String getMenu_name() {
		return menu_name;
	}

	public void setMenu_name(String menu_name) {
		this.menu_name = menu_name;
	}

	public String getMenu_type() {
		return menu_type;
	}

	public void setMenu_type(String menu_type) {
		this.menu_type = menu_type;
	}

	public String getParent_id() {
		return parent_id;
	}

	public void setParent_id(String parent_id) {
		this.parent_id = parent_id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getPermission() {
		return permission;
	}

	public void setPermission(String permission) {
		this.permission = permission;
	}

	public String getVisible() {
		return visible;
	}

	public void setVisible(String visible) {
		this.visible = visible;
	}

	public String getDel_flag() {
		return del_flag;
	}

	public void setDel_flag(String del_flag) {
		this.del_flag = del_flag;
	}

	@Override
	protected Serializable pkVal() {
		return this.auth_id;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getComponent() {
		return component;
	}

	public void setComponent(String component) {
		this.component = component;
	}

	public int getSort() {
		return sort;
	}

	public void setSort(int sort) {
		this.sort = sort;
	}

	@Override
	public String toString() {
		return "Menu [auth_id=" + auth_id + ", menu_name=" + menu_name + ", menu_type=" + menu_type + ", parent_id="
				+ parent_id + ", url=" + url + ", method=" + method + ", path=" + path + ", permission=" + permission
				+ ", visible=" + visible + ", createby=" + createby + ", icon=" + icon + ", component=" + component
				+ ", sort=" + sort + ", createtime=" + createtime + ", del_flag=" + del_flag + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((auth_id == null) ? 0 : auth_id.hashCode());
		result = prime * result + ((component == null) ? 0 : component.hashCode());
		result = prime * result + ((createby == null) ? 0 : createby.hashCode());
		result = prime * result + ((createtime == null) ? 0 : createtime.hashCode());
		result = prime * result + ((del_flag == null) ? 0 : del_flag.hashCode());
		result = prime * result + ((icon == null) ? 0 : icon.hashCode());
		result = prime * result + ((menu_name == null) ? 0 : menu_name.hashCode());
		result = prime * result + ((menu_type == null) ? 0 : menu_type.hashCode());
		result = prime * result + ((method == null) ? 0 : method.hashCode());
		result = prime * result + ((parent_id == null) ? 0 : parent_id.hashCode());
		result = prime * result + ((path == null) ? 0 : path.hashCode());
		result = prime * result + ((permission == null) ? 0 : permission.hashCode());
		result = prime * result + sort;
		result = prime * result + ((url == null) ? 0 : url.hashCode());
		result = prime * result + ((visible == null) ? 0 : visible.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Menu other = (Menu) obj;
		if (auth_id == null) {
			if (other.auth_id != null)
				return false;
		} else if (!auth_id.equals(other.auth_id))
			return false;
		if (component == null) {
			if (other.component != null)
				return false;
		} else if (!component.equals(other.component))
			return false;
		if (createby == null) {
			if (other.createby != null)
				return false;
		} else if (!createby.equals(other.createby))
			return false;
		if (createtime == null) {
			if (other.createtime != null)
				return false;
		} else if (!createtime.equals(other.createtime))
			return false;
		if (del_flag == null) {
			if (other.del_flag != null)
				return false;
		} else if (!del_flag.equals(other.del_flag))
			return false;
		if (icon == null) {
			if (other.icon != null)
				return false;
		} else if (!icon.equals(other.icon))
			return false;
		if (menu_name == null) {
			if (other.menu_name != null)
				return false;
		} else if (!menu_name.equals(other.menu_name))
			return false;
		if (menu_type == null) {
			if (other.menu_type != null)
				return false;
		} else if (!menu_type.equals(other.menu_type))
			return false;
		if (method == null) {
			if (other.method != null)
				return false;
		} else if (!method.equals(other.method))
			return false;
		if (parent_id == null) {
			if (other.parent_id != null)
				return false;
		} else if (!parent_id.equals(other.parent_id))
			return false;
		if (path == null) {
			if (other.path != null)
				return false;
		} else if (!path.equals(other.path))
			return false;
		if (permission == null) {
			if (other.permission != null)
				return false;
		} else if (!permission.equals(other.permission))
			return false;
		if (sort != other.sort)
			return false;
		if (url == null) {
			if (other.url != null)
				return false;
		} else if (!url.equals(other.url))
			return false;
		if (visible == null) {
			if (other.visible != null)
				return false;
		} else if (!visible.equals(other.visible))
			return false;
		return true;
	}
   
	
	
}
