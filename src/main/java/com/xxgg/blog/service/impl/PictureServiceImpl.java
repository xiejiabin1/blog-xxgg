package com.xxgg.blog.service.impl;

import com.xxgg.blog.model.po.Picture;
import com.xxgg.blog.mapper.PictureMapper;
import com.xxgg.blog.service.IPictureService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 图片储存表 服务实现类
 * </p>
 *
 * @author 先谢郭嘉
 * @since 2020-11-22
 */
@Service
public class PictureServiceImpl extends ServiceImpl<PictureMapper, Picture> implements IPictureService {

}
