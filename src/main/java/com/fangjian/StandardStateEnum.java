package com.chinaredstar.jc.rsv.common.enums.inspection.standard;

/**
 * @description: 标准的状态枚举类 0:无效,1:有效
 * @author: fangjian<jian.fang@chinaredstar.com>
 * @date: Create in 15:39 2017/10/23
 * @modified by:
 */
public enum StandardStateEnum {
    INVALID(0, "无效"),
    VALID(1, "有效");

    StandardStateEnum(Integer code, String value) {
        this.code = code;
        this.value = value;
    }

    private Integer code;
    private String value;

    public Integer getCode() {
        return code;
    }

    public String getValue() {
        return value;
    }
}
