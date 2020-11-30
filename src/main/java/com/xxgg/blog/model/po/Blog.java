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
 * 博文表
 * </p>
 *
 * @author 先谢郭嘉
 * @since 2020-11-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("blog")
@ApiModel(value="Blog对象", description="博文表")
public class Blog implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "blogId", type = IdType.AUTO)
    private Long blogId;

    @ApiModelProperty(value = "标题")
    @TableField("title")
    private String title;

    @ApiModelProperty(value = "内容")
    @TableField("content")
    private String content;

    @ApiModelProperty(value = "首图地址")
    @TableField("firstPicture")
    private String firstPicture;

    @ApiModelProperty(value = "标签，比如原创、转载、翻译等")
    @TableField("tab")
    private String tab;

    @ApiModelProperty(value = "浏览次数")
    @TableField("views")
    private Integer views;

    @ApiModelProperty(value = "评论次数")
    @TableField("commentCount")
    private Integer commentCount;

    @ApiModelProperty(value = "是否开启赞赏")
    @TableField("appreciation")
    private Boolean appreciation;

    @ApiModelProperty(value = "是否开启版权声明")
    @TableField("shareStatement")
    private Boolean shareStatement;

    @ApiModelProperty(value = "是否开启评论")
    @TableField("commentBled")
    private Boolean commentBled;

    @ApiModelProperty(value = "是否发布")
    @TableField("published")
    private Boolean published;

    @ApiModelProperty(value = "是否推荐")
    @TableField("recommend")
    private Boolean recommend;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    @ApiModelProperty(value = "创建时间")
    @TableField("createTime")
    private Date createTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    @ApiModelProperty(value = "更新时间")
    @TableField("updateTime")
    private Date updateTime;

    @ApiModelProperty(value = "博客描述")
    @TableField("description")
    private String description;

    @ApiModelProperty(value = "分类id")
    @TableField("typeId")
    private Long typeId;

    @ApiModelProperty(value = "用户id")
    @TableField("userId")
    private Long userId;


}
