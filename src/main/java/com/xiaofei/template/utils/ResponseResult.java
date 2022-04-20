package com.xiaofei.template.utils;

import lombok.Data;
import org.apache.commons.lang3.StringUtils;
/**
 * User: 李飞
 * Date: 2022/4/20
 * Time: 14:23
 *
 * @author 李飞
 */
@Data
public class ResponseResult<T> {

    private Integer code;
    private String msg;
    private T data;

    public ResponseResult<T> success() {
        this.code = 200;
        this.msg = "操作成功";
        return this;
    }

    public ResponseResult<T> success(T data) {
        this.success();
        this.data = data;
        return this;
    }

    public ResponseResult<T> success(String msg, T data) {
        this.success(data);
        this.msg = StringUtils.isEmpty(msg) ? "操作成功" : msg;
        return this;
    }

    public ResponseResult<T> error() {
        this.code = 400;
        this.msg = "系统出错，请重新请求";
        return this;
    }

    public ResponseResult<T> error(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
        return this;
    }

    public ResponseResult<T> error(Integer code, String msg, T data) {
        error(code, msg);
        this.data = data;
        return this;
    }

}
