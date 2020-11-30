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
import org.springframework.format.annotation.DateTimeFormat;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author 先谢郭嘉
 * @since 2020-11-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("user")
@ApiModel(value="User对象", description="用户表")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "用户id")
    @TableId(value = "userId", type = IdType.AUTO)
    private Long userId;

    @ApiModelProperty(value = "昵称")
    @TableField("nickName")
    private String nickName;

    @ApiModelProperty(value = "用户名")
    @TableField("userName")
    private String userName;

    @ApiModelProperty(value = "密码")
    @TableField("password")
    private String password;

    @ApiModelProperty(value = "邮箱")
    @TableField("email")
    private String email;

    @ApiModelProperty(value = "头像地址")
    @TableField("avatar")
    private String avatar;

    // @JsonFormat主要是后台到前台的时间格式的转换
    // pattern:是你需要转换的时间日期的格式
    // timezone：是时间设置为东八区，避免时间在转换中有误差
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    @ApiModelProperty(value = "创建时间")
    @TableField("createTime")
    private Date createTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    @ApiModelProperty(value = "修改时间")
    @TableField("updateTime")
    private Date updateTime;

    @ApiModelProperty(value = "状态：默认1正常，2冻结，3删除")
    @TableField("status")
    private Integer status;


}
