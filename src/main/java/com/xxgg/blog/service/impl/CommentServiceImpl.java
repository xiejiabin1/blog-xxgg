package com.xxgg.blog.service.impl;

import com.xxgg.blog.model.po.Comment;
import com.xxgg.blog.mapper.CommentMapper;
import com.xxgg.blog.service.ICommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 评论表 服务实现类
 * </p>
 *
 * @author 先谢郭嘉
 * @since 2020-11-22
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements ICommentService {

}
