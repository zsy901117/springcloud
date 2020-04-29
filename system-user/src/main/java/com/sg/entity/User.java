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
@ApiModel(value="用户")
public class User extends Model<User> {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@ApiModelProperty(value="用户id",name = "user_id")
	private String user_id;

	/**
	 * 用户名
	 */
	@ApiModelProperty(value="用户名",name = "username")
	private String username;

	/**
	 * 密码
	 */
	@ApiModelProperty(value="密码",name="password")
	private String password;
	/**
	 * 令牌
	 */
	@ApiModelProperty(value="令牌")
	private String token;
	/**
	 * 姓名
	 */
	@ApiModelProperty(value="姓名")
	private String name;

	/**
	 * 单位
	 */
	@ApiModelProperty(value="单位")
	private String company;

	/**
	 * 部门
	 */
	@ApiModelProperty(value="部门")
	private String department;

	/**
	 * 职务
	 */
	@ApiModelProperty(value="职务")
	private String duty;

	/**
	 * 联系电话
	 */
	@ApiModelProperty(value="联系电话")
	private String tel;

	/**
	 * 是否删除
	 */
	@ApiModelProperty(value="是否删除")
	private String del_flag;
	@ApiModelProperty(value="角色集合")
	private List<Role> role;

	public List<Role> getRoles() {
		return role;
	}

	public void setRoles(List<Role> role) {
		this.role = role;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public List<Role> getRole() {
		return role;
	}

	public void setRole(List<Role> role) {
		this.role = role;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDuty() {
		return duty;
	}

	public void setDuty(String duty) {
		this.duty = duty;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	
	public String getDel_flag() {
		return del_flag;
	}

	public void setDel_flag(String del_flag) {
		this.del_flag = del_flag;
	}

	@Override
	protected Serializable pkVal() {
		return this.user_id;
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", username=" + username + ", password=" + password + ", token=" + token
				+ ", name=" + name + ", company=" + company + ", department=" + department + ", duty=" + duty + ", tel="
				+ tel + ", del_flag=" + del_flag + ", role=" + role + "]";
	}

    
}
