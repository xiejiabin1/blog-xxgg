package com.xxgg.blog.service.impl;

import com.xxgg.blog.model.po.Link;
import com.xxgg.blog.mapper.LinkMapper;
import com.xxgg.blog.service.ILinkService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 友链表 服务实现类
 * </p>
 *
 * @author 先谢郭嘉
 * @since 2020-12-01
 */
@Service
public class LinkServiceImpl extends ServiceImpl<LinkMapper, Link> implements ILinkService {

}
