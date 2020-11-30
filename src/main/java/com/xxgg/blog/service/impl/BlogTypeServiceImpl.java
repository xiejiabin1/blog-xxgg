package com.xxgg.blog.service.impl;

import com.xxgg.blog.model.po.BlogType;
import com.xxgg.blog.mapper.BlogTypeMapper;
import com.xxgg.blog.service.IBlogTypeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 博文类型表 服务实现类
 * </p>
 *
 * @author 先谢郭嘉
 * @since 2020-11-22
 */
@Service
public class BlogTypeServiceImpl extends ServiceImpl<BlogTypeMapper, BlogType> implements IBlogTypeService {

}
