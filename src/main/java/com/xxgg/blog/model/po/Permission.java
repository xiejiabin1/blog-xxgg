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
 * 权限表
 * </p>
 *
 * @author 先谢郭嘉
 * @since 2020-11-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("permission")
@ApiModel(value="Permission对象", description="权限表")
public class Permission implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "权限id")
    @TableId(value = "permissionId", type = IdType.AUTO)
    private Long permissionId;

    @ApiModelProperty(value = "权限名称")
    @TableField("name")
    private String name;

    @ApiModelProperty(value = "权限url")
    @TableField("url")
    private String url;

    @ApiModelProperty(value = "权限图标")
    @TableField("ico")
    private String ico;

    @ApiModelProperty(value = "备注")
    @TableField("remark")
    private String remark;


}
