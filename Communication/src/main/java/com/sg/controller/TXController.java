package com.sg.controller;

import com.alibaba.fastjson.JSONObject;
import com.sg.util.Shell;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;

@RestController
@Api(value = "通信服务")
public class TXController {
    @Value("${ftp.server.ip}")
    private String ftpServerIp;
    @Value("${ftp.server.uname}")
    private String rootname;
    @Value("${ftp.server.password}")
    private String rootpassword;

    /**
     *邮件服务器添加用户
     * @return
     */
    @RequestMapping(value = "/api/addYjUser", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "邮件服务器添加用户")
    @ApiImplicitParams({
            @ApiImplicitParam(value = "用户名",name = "uname",required = true,dataType = "String",paramType = "query"),
            @ApiImplicitParam(value = "密码",name = "password",required = true,dataType = "String",paramType = "query")
    })
    public String addYjUser(@RequestParam String uname,@RequestParam String password) {
        JSONObject result = new JSONObject();
        boolean flag = true;
        try {
            Shell shell = new Shell(ftpServerIp, rootname, rootpassword);
            //shell.execute("useradd -s /sbin/nologin test4");
            //shell.execute("passwd  test4");
            shell.execute("useradd -s /sbin/nologin "+uname+";echo "+password+" | passwd --stdin "+uname);
        }
        catch(Exception e){
            flag = false;
        }

        result.put("msg", "ok");
        result.put("method", "json");
        result.put("data", flag);
        return result.toJSONString();
    }

    /**
     *邮件服务器删除用户
     * @return
     */
    @RequestMapping(value = "/api/delYjUser", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "邮件服务器删除用户")
    @ApiImplicitParam(value = "用户名",name = "uname",required = true,dataType = "String",paramType = "query")
    public String delYjUser(@RequestParam String uname) {
        JSONObject result = new JSONObject();
        boolean flag = true;
        try {
            Shell shell = new Shell(ftpServerIp, rootname, rootpassword);
            //shell.execute("useradd -s /sbin/nologin test4");
            //shell.execute("passwd  test4");
            shell.execute("userdel -rf "+uname);
        }
        catch(Exception e){
            flag = false;
        }

        result.put("msg", "ok");
        result.put("method", "json");
        result.put("data", flag);
        return result.toJSONString();
    }

    /**
     *邮件服务器修改密码
     * @return
     */
    @RequestMapping(value = "/api/changePwd", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "邮件服务器修改用户密码")
    @ApiImplicitParams({
            @ApiImplicitParam(value = "用户名",name = "uname",required = true,dataType = "String",paramType = "query"),
            @ApiImplicitParam(value = "密码",name = "password",required = true,dataType = "String",paramType = "query")
    })
    public String changePwd(@RequestParam String uname, @RequestParam String password) {
        JSONObject result = new JSONObject();
        boolean flag = true;
        try {
            Shell shell = new Shell(ftpServerIp, rootname, rootpassword);
            //shell.execute("useradd -s /sbin/nologin test4");
            //shell.execute("passwd  test4");
            shell.execute("echo \""+password+"\" | passwd "+uname+" --stdin");
        }
        catch(Exception e){
            flag = false;
        }

        result.put("msg", "ok");
        result.put("method", "json");
        result.put("data", flag);
        return result.toJSONString();
    }
}
