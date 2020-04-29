package com.sg.entity;

import java.io.Serializable;
import java.util.List;

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
@ApiModel(value="角色")
public class Role extends Model<Role> {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@ApiModelProperty(value="角色id")
	private String role_id;

	/**
	 * 角色编码
	 */
	@ApiModelProperty(value="角色编码")
	private String role_code;

	/**
	 * 角色中文名称
	 */
	@ApiModelProperty(value="角色名称")
	private String role_name;

	/**
	 * 是否删除
	 */
	@ApiModelProperty(value="是否删除")
	private String del_flag;
	@ApiModelProperty(value="菜单集合")
	private List<String> menuids;

	
	public List<String> getMenuids() {
		return menuids;
	}

	public void setMenuids(List<String> menuids) {
		this.menuids = menuids;
	}

	public String getRole_id() {
		return role_id;
	}

	public void setRole_id(String role_id) {
		this.role_id = role_id;
	}

	public String getRole_code() {
		return role_code;
	}

	public void setRole_code(String role_code) {
		this.role_code = role_code;
	}

	public String getRole_name() {
		return role_name;
	}

	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}

	public String getDel_flag() {
		return del_flag;
	}

	public void setDel_flag(String del_flag) {
		this.del_flag = del_flag;
	}

	@Override
	protected Serializable pkVal() {
		return this.role_id;
	}

	@Override
	public String toString() {
		return "Role{" + "role_id=" + role_id + ", role_code=" + role_code + ", role_name=" + role_name + ", del_flag="
				+ del_flag + "}";
	}
}
