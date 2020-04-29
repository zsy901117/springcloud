package com.sg.controller;

import java.util.List;

import com.sg.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sg.dto.LoginDTO;
import com.sg.dto.UserInfoDTO;
import com.sg.entity.Menu;
import com.sg.entity.User;
import com.sg.query.UserQuery;
import com.sg.service.impl.UserServiceImpl;
import com.sg.util.UserUtils;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author zsy
 * @since 2019-05-26
 */
@RestController
@RequestMapping("/user")
@Api(value = "用户前端控制器")
public class UserController {

    @Autowired
    private UserServiceImpl userservice;
    @Autowired
    private UserMapper userMapper;

    /**
     * 登录并返回token
     *
     * @param username
     * @param password
     * @return
     */
    @PostMapping("/login")
    @ApiOperation(value = "用户名密码登录")
    @ApiImplicitParams({
            @ApiImplicitParam(value = "用户名", name = "username", dataType = "String", required = true, paramType = "query"),
            @ApiImplicitParam(value = "密码", name = "password", dataType = "String", required = true, paramType = "query"),
    })
    public LoginDTO login(@RequestParam String username, @RequestParam String password) {
        return userservice.login(username, password);
    }

    /**
     * 根据token查询信息
     *
     * @param ID
     * @return 结果
     */
    @PostMapping("/info")
    @ResponseBody
    @ApiOperation(value = "通过token获取用户信息")
    @ApiImplicitParam(value = "令牌", name = "access_token", dataType = "String", required = true, paramType = "query")
    public UserInfoDTO getInfo() {
        String username = UserUtils.getCurrentPrinciple();
        return userservice.getInfo(username);
    }

    @PostMapping("/resource")
    @ApiOperation(value = "通过用户名获取菜单集合")
    @ApiImplicitParams({
            @ApiImplicitParam(value = "令牌", name = "access_token", dataType = "String", required = true, paramType = "query"),
            @ApiImplicitParam(name = "username", value = "用户名", dataType = "String", required = true, paramType = "query")
    })
    public List<Menu> resource(@RequestParam(value = "username") String username) {
        return userservice.getMenus(username);
    }

    @PostMapping("/page")
    @ApiOperation(value = "分页查询用户信息")
    @ApiImplicitParams({
            @ApiImplicitParam(value = "令牌", name = "access_token", dataType = "String", required = true, paramType = "query"),
    })
    public UserQuery page(UserQuery query) {
        return userservice.pageUserByQuery(query);
    }

    /**
     * 根据用户名查询信息
     *
     * @param ID
     * @return 结果
     */
    @GetMapping("/name")
    @ResponseBody
    @ApiOperation(value = "用户名查询用户信息")
    @ApiImplicitParams({
            @ApiImplicitParam(value = "令牌", name = "access_token", dataType = "String", required = true, paramType = "query"),
            @ApiImplicitParam(value = "用户名", name = "username", required = true, dataType = "String", paramType = "query")
    })
    public User findByName(@RequestParam String username) {
        return userservice.selectByName(username);
    }

    @GetMapping("/checkUser")
    @ApiOperation(value = "根据用户名查询用户数量")
    @ApiImplicitParams({
            @ApiImplicitParam(value = "令牌", name = "access_token", dataType = "String", required = true, paramType = "query"),
            @ApiImplicitParam(value = "用户名", name = "username", required = true, dataType = "String", paramType = "query")
    })
    public int checkUser(@RequestParam String username) {
        return userservice.checkUser(username);
    }

    /**
     * 根据主键查询用户
     *
     * @param id
     * @return
     */
    @GetMapping("/id")
    @ApiOperation(value = "主键查询用户信息")
    @ApiImplicitParams({
            @ApiImplicitParam(value = "令牌", name = "access_token", dataType = "String", required = true, paramType = "query"),
            @ApiImplicitParam(value = "主键", name = "id", required = true, dataType = "String", paramType = "query")
    })
    public User findById(@RequestParam String id) {
        return userservice.selectById(id);
    }

    /**
     * 新增user
     *
     * @param User信息
     */
    @PostMapping("/add")
    @ApiOperation(value = "添加用户")
    @ApiImplicitParams({
            @ApiImplicitParam(value = "令牌", name = "access_token", dataType = "String", required = true, paramType = "query"),
            @ApiImplicitParam(value = "用户实体类", name = "user", dataType = "User", required = true),
    })
    public Boolean add(@RequestBody User user) {
        int num = userservice.insert(user);
        if (num > 0) {
            return true;
        }
        return false;
    }

    /**
     * 修改user
     *
     * @param User 信息
     * @return 结果
     */
    @PostMapping("/update")
    @ApiOperation(value = "修改用户及角色信息")
    @ApiImplicitParams({
            @ApiImplicitParam(value = "令牌", name = "access_token", dataType = "String", required = true, paramType = "query"),
            @ApiImplicitParam(value = "用户实体类", name = "user", dataType = "User", required = true),
    })
    public int update(@RequestBody User user) {
        return userservice.update(user);
    }

	/**
	 *
	 * @param user
	 * @return
	 */
	@PostMapping("/updateInfo")
	@ApiOperation(value = "修改用户信息")
	@ApiImplicitParams({
			@ApiImplicitParam(value = "令牌", name = "access_token", dataType = "String", required = true, paramType = "query"),
			@ApiImplicitParam(value = "用户实体类", name = "user", dataType = "User", required = true),
	})
    public int updateInfo(@RequestBody User user) {
        System.out.println(user.toString());
        return userMapper.update(user);
    }

    /**
     * 修改密码
     *
     * @param user
     * @return
     */
    @PostMapping("/updatepwd")
    @ApiOperation(value = "修改用户密码")
    @ApiImplicitParams({
            @ApiImplicitParam(value = "令牌", name = "access_token", dataType = "String", required = true, paramType = "query"),
            @ApiImplicitParam(value = "用户实体类", name = "user", dataType = "User", required = true),
    })
    public int updatepwd(@RequestBody User user) {
        System.out.println(user.toString());
        return userservice.updatepwd(user);
    }

    /**
     * 根据主键删除
     *
     * @param ID
     * @return 结果
     */
    @PostMapping("/deleteById")
    @ApiOperation(value = "根据主键删除用户")
    @ApiImplicitParams({
            @ApiImplicitParam(value = "令牌", name = "access_token", dataType = "String", required = true, paramType = "query"),
            @ApiImplicitParam(value = "主键", name = "id", required = true, dataType = "String", paramType = "query")
    })
    public int deleteOne(@RequestParam String id) {
        return userservice.delete(id);
    }

}
