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
 * 日志表
 * </p>
 *
 * @author 先谢郭嘉
 * @since 2020-11-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("log")
@ApiModel(value="Log对象", description="日志表")
public class Log implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "日志id")
    @TableId(value = "logId", type = IdType.AUTO)
    private Long logId;

    @ApiModelProperty(value = "操作")
    @TableField("operation")
    private String operation;

    @ApiModelProperty(value = "ip地址")
    @TableField("ip")
    private String ip;

    @ApiModelProperty(value = "用户id")
    @TableField("userId")
    private Long userId;

    @ApiModelProperty(value = "请求地址")
    @TableField("url")
    private String url;

    @ApiModelProperty(value = "请求方式")
    @TableField("method")
    private String method;

    @ApiModelProperty(value = "提交参数")
    @TableField("params")
    private String params;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    @ApiModelProperty(value = "创建时间")
    @TableField("createTime")
    private Date createTime;


}
