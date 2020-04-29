package com.sg.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author zsy
 * @since 2019-05-26
 */
public class User_role extends Model<User_role> {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID
     */
    private String user_id;

    /**
     * 角色ID
     */
    private String role_id;


    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getRole_id() {
        return role_id;
    }

    public void setRole_id(String role_id) {
        this.role_id = role_id;
    }

    @Override
    protected Serializable pkVal() {
        return this.user_id;
    }

    @Override
    public String toString() {
        return "User_role{" +
        "user_id=" + user_id +
        ", role_id=" + role_id +
        "}";
    }
}
