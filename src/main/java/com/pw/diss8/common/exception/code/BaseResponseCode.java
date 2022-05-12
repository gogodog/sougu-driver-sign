package com.pw.diss8.common.exception.code;


/**
 * 错误码
 *
 * @author Prescott.Wen
 * @version V1.0
 * @date 2021年7月18日
 */
public enum BaseResponseCode implements ResponseCodeInterface {
    /**
     * 错误码
     */
    SUCCESS(0, "操作成功"),
    SYSTEM_BUSY(500001, "系统繁忙，请稍候再试"),
    OPERATION_ERRO(500002, "操作失败"),
    DATA_ERROR(401003, "传入数据异常"),
    NAME_EMPTY_ERROR(401004, "名称不能为空"),
    TEL_EMPTY_ERROR(401005, "电话不能为空"),
    IDENTITY_EMPTY_ERROR(401006, "身份证不能为空"),
    NAME_EXISTED_ERROR(401007, "名称已注册"),
    TEL_EXISTED_ERROR(401008, "电话已注册"),
    IDENTITY_EXISTED_ERROR(401009, "身份证已注册"),
    METHOD_ARGUMENT_NOT_VALID_EXCEPTION(401010, "方法参数校验异常")
    ;

    /**
     * 错误码
     */
    private final int code;
    /**
     * 错误消息
     */
    private final String msg;

    BaseResponseCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getMsg() {
        return msg;
    }
}
