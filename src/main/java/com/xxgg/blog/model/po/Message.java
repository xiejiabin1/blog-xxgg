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
 * 留言表
 * </p>
 *
 * @author 先谢郭嘉
 * @since 2020-11-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("message")
@ApiModel(value="Message对象", description="留言表")
public class Message implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "留言id")
    @TableId(value = "messageId", type = IdType.AUTO)
    private Long messageId;

    @ApiModelProperty(value = "用户id")
    @TableField("userId")
    private Long userId;

    @ApiModelProperty(value = "父留言id")
    @TableField("parentId")
    private Long parentId;

    @ApiModelProperty(value = "留言内容")
    @TableField("content")
    private String content;

    @ApiModelProperty(value = "是否为管理员留言")
    @TableField("adminMessage")
    private Integer adminMessage;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    @ApiModelProperty(value = "创建时间")
    @TableField("createTime")
    private Date createTime;


}
