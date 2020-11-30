package com.xxgg.blog.service.impl;

import com.xxgg.blog.model.po.Log;
import com.xxgg.blog.mapper.LogMapper;
import com.xxgg.blog.service.ILogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 日志表 服务实现类
 * </p>
 *
 * @author 先谢郭嘉
 * @since 2020-11-22
 */
@Service
public class LogServiceImpl extends ServiceImpl<LogMapper, Log> implements ILogService {

}
