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
public class Role_menu extends Model<Role_menu> {

    private static final long serialVersionUID = 1L;

    /**
     * 角色ID
     */
    private String role_id;

    /**
     * 权限ID
     */
    private String auth_id;


    public String getRole_id() {
        return role_id;
    }

    public void setRole_id(String role_id) {
        this.role_id = role_id;
    }

    public String getAuth_id() {
        return auth_id;
    }

    public void setAuth_id(String auth_id) {
        this.auth_id = auth_id;
    }

    @Override
    protected Serializable pkVal() {
        return this.role_id;
    }

    @Override
    public String toString() {
        return "Role_menu{" +
        "role_id=" + role_id +
        ", auth_id=" + auth_id +
        "}";
    }
}
