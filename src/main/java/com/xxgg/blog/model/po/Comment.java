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
 * 评论表
 * </p>
 *
 * @author 先谢郭嘉
 * @since 2020-11-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("comment")
@ApiModel(value="Comment对象", description="评论表")
public class Comment implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "评论id")
    @TableId(value = "commentId", type = IdType.AUTO)
    private Long commentId;

    @ApiModelProperty(value = "博文id")
    @TableField("blogId")
    private Long blogId;

    @ApiModelProperty(value = "用户id")
    @TableField("userId")
    private Long userId;

    @ApiModelProperty(value = "父评论id")
    @TableField("parentId")
    private Long parentId;

    @ApiModelProperty(value = "内容")
    @TableField("content")
    private String content;

    @ApiModelProperty(value = "是否为管理员评论")
    @TableField("adminComment")
    private Integer adminComment;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    @ApiModelProperty(value = "创建时间")
    @TableField("createTime")
    private Date createTime;


}
