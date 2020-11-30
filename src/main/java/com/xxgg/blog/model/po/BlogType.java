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
 * 博文类型表
 * </p>
 *
 * @author 先谢郭嘉
 * @since 2020-11-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("blog_type")
@ApiModel(value="BlogType对象", description="博文类型表")
public class BlogType implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "博文分类id")
    @TableId(value = "typeId", type = IdType.AUTO)
    private Long typeId;

    @ApiModelProperty(value = "分类名称")
    @TableField("typeName")
    private String typeName;

    @ApiModelProperty(value = "备注")
    @TableField("remark")
    private String remark;


}
