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
 * 图片储存表
 * </p>
 *
 * @author 先谢郭嘉
 * @since 2020-11-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("picture")
@ApiModel(value="Picture对象", description="图片储存表")
public class Picture implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "图片id")
    @TableId(value = "pictureId", type = IdType.AUTO)
    private Long pictureId;

    @ApiModelProperty(value = "图片名称")
    @TableField("pictureName")
    private String pictureName;

    @ApiModelProperty(value = "图片地址")
    @TableField("pictureAddress")
    private String pictureAddress;

    @ApiModelProperty(value = "备注")
    @TableField("remark")
    private String remark;


}
