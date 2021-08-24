package com.xxgg.blog.controller;


import com.xxgg.blog.service.IUserService;
import io.swagger.annotations.Api;
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


}
