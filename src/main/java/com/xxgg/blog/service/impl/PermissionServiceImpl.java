package com.xxgg.blog.service.impl;

import com.xxgg.blog.model.po.Permission;
import com.xxgg.blog.mapper.PermissionMapper;
import com.xxgg.blog.service.IPermissionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 权限表 服务实现类
 * </p>
 *
 * @author 先谢郭嘉
 * @since 2020-11-22
 */
@Service
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission> implements IPermissionService {

}
