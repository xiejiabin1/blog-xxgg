package com.xxgg.blog.model.po;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 友链表
 * </p>
 *
 * @author 先谢郭嘉
 * @since 2020-11-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("friendlink")
@ApiModel(value="Friendlink对象", description="友链表")
public class Friendlink implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "友链id")
    @TableId(value = "friendLinkId", type = IdType.AUTO)
    private Long friendLinkId;

    @ApiModelProperty(value = "博客名称")
    @TableField("blogName")
    private String blogName;

    @ApiModelProperty(value = "博客地址")
    @TableField("blogAddress")
    private String blogAddress;

    @ApiModelProperty(value = "博客图片地址")
    @TableField("blogPicture")
    private String blogPicture;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    @ApiModelProperty(value = "创建时间")
    @TableField("createTime")
    private Date createTime;

    @ApiModelProperty(value = "描述")
    @TableField("description")
    private String description;


}
