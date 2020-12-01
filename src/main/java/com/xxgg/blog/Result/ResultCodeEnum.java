package com.xxgg.blog.Result;

import lombok.Getter;

/**
 * @description: 返回状态枚举类
 * @author: 先谢郭嘉
 * @create: 2020-11-22 17:23
 */
@Getter
public enum  ResultCodeEnum {
    SUCCESS(true, "0", "成功"),
    FAIL(false, "1", "失败"),
    ERROR(false, "-1", "系统异常");

    private Boolean flag;       //是否成功
    private String code;        //状态码
    private String message;     //返回信息

    ResultCodeEnum(Boolean flag, String code, String message) {
        this.flag = flag;
        this.code = code;
        this.message = message;
    }

}
