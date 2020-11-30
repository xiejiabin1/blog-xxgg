package com.xxgg.blog.service.impl;

import com.xxgg.blog.model.po.Message;
import com.xxgg.blog.mapper.MessageMapper;
import com.xxgg.blog.service.IMessageService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 留言表 服务实现类
 * </p>
 *
 * @author 先谢郭嘉
 * @since 2020-11-22
 */
@Service
public class MessageServiceImpl extends ServiceImpl<MessageMapper, Message> implements IMessageService {

}
