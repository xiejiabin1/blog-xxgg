package com.xxgg.blog.model.po;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
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
 * @since 2020-12-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("link")
@ApiModel(value="Link对象", description="友链表")
public class Link implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "友链id")
    @TableId(value = "linkId", type = IdType.AUTO)
    private Long linkId;

    @ApiModelProperty(value = "博客名称")
    @TableField("blogName")
    private String blogName;

    @ApiModelProperty(value = "博客地址")
    @TableField("blogAddress")
    private String blogAddress;

    @ApiModelProperty(value = "博客图片地址")
    @TableField("blogPicture")
    private String blogPicture;

    @ApiModelProperty(value = "创建时间")
    @TableField("createTime")
    private Date createTime;

    @ApiModelProperty(value = "描述")
    @TableField("description")
    private String description;


}
