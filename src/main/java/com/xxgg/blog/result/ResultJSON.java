package com.xxgg.blog.result;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @description: 全局统一返回结果
 * @author: 先谢郭嘉
 * @create: 2020-11-22 16:22
 */
@Data
@ApiModel(value="Response对象", description="全局统一返回结果")
public class ResultJSON<T> implements Serializable {

    @ApiModelProperty(value = "是否成功")
    private Boolean flag;

    @ApiModelProperty(value = "状态码")
    private String code;

    @ApiModelProperty(value = "返回信息")
    private String message;

    @ApiModelProperty(value = "传输的数据")
    private T data;

    public ResultJSON(){}

    public ResultJSON(Boolean flag, String code, String message){
        this.flag = flag;
        this.code = code;
        this.message = message;
    }

    public ResultJSON(Boolean flag, String code, String message, T data){
        this.flag = flag;
        this.code = code;
        this.message = message;
        this.data = data;
    }

    /**
     * 请求成功并有数据
     */
    public static<T> ResultJSON<T> success(T data){
        return new ResultJSON<T>(ResultCodeEnum.SUCCESS.getFlag(),
                ResultCodeEnum.SUCCESS.getCode(),
                ResultCodeEnum.SUCCESS.getMessage(), data);
    }

    /**
     * 请求成功没数据
     */
    public static<T> ResultJSON<T> success(){
        return new ResultJSON<T>(ResultCodeEnum.SUCCESS.getFlag(),
                ResultCodeEnum.SUCCESS.getCode(),
                ResultCodeEnum.SUCCESS.getMessage());
    }

    /**
     * 请求无效
     */
    public static<T> ResultJSON<T> fail(T data){
        return new ResultJSON<T>(ResultCodeEnum.INVALID_REQUEST.getFlag(),
                ResultCodeEnum.INVALID_REQUEST.getCode(),
                ResultCodeEnum.INVALID_REQUEST.getMessage(),data);
    }

    /**
     * 系统异常
     */
    public static<T> ResultJSON<T> error(T data){
        return new ResultJSON<T>(ResultCodeEnum.ERROR.getFlag(),
                ResultCodeEnum.ERROR.getCode(),
                ResultCodeEnum.ERROR.getMessage(),data);
    }

    public ResultJSON<T> data(T data){
        this.setData(data);
        return this;
    }
    public ResultJSON<T> message(String message){
        this.setMessage(message);
        return this;
    }
    public ResultJSON<T> flag(Boolean flag){
        this.setFlag(flag);
        return this;
    }
    public ResultJSON<T> code(String code){
        this.setCode(code);
        return this;
    }
}
