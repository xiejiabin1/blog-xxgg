package com.xxgg.blog.controller;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.xxgg.blog.Result.ResultJSON;
import com.xxgg.blog.model.po.User;
import com.xxgg.blog.service.IUserService;
import com.xxgg.blog.utils.TokenUtil;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author 先谢郭嘉
 * @since 2020-11-22
 */
@Api(tags="用户controller")
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private IUserService userService;

    @PostMapping("/login")
    public ResultJSON<String> login(String username, String password) throws JsonProcessingException {
        //检验用户密码
        User user = new User();
        if(username.equals("xxgg") && password.equals("430423")){
            user.setUserName(username);
            user.setPassword(password);
            String token = TokenUtil.sign(user, (long) (15*60*1000));
            return ResultJSON.success(token).message("认证成功，返回token");
        }else {
            return ResultJSON.fail("").message("认证失败");
        }
    }

}
