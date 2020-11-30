package com.xxgg.blog.model.po;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 程序表
 * </p>
 *
 * @author 先谢郭嘉
 * @since 2020-11-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("program")
@ApiModel(value="Program对象", description="程序表")
public class Program implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "程序id")
    @TableId(value = "programId", type = IdType.AUTO)
    private Long programId;

    @ApiModelProperty(value = "程序名称")
    @TableField("programName")
    private String programName;

    @ApiModelProperty(value = "程序链接")
    @TableField("url")
    private String url;

    @ApiModelProperty(value = "程序描述")
    @TableField("description")
    private String description;


}
