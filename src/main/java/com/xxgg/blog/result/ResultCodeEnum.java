package com.xxgg.blog.result;

import lombok.Getter;

/**
 * @description: 返回状态枚举类
 * @author: 先谢郭嘉
 * @create: 2020-11-22 17:23
 */
@Getter
public enum  ResultCodeEnum {
    SUCCESS(true, "200", "成功"),
    WARNING(false, "501", "警告"),
    ERROR(false, "500", "错误"),
    NOT_JUR(false, "403", "无权限"),
    NOT_LOGIN(false, "401", "未登录"),
    INVALID_REQUEST(false, "400", "无效请求");

    /**
     * 是否成功
     */
    private Boolean flag;
    /**
     * 状态码
     */
    private String code;
    /**
     * 返回信息
     */
    private String message;

    ResultCodeEnum(Boolean flag, String code, String message) {
        this.flag = flag;
        this.code = code;
        this.message = message;
    }

}
