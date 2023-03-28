package me.songha.assignment.error;

import lombok.Getter;

@Getter
public enum ErrorCode {
    VOUCHER_NOT_FOUND("error_001", "해당 바우처를 찾을 수 없습니다.", 404),
    INPUT_VALUE_INVALID("error_003", "입력값이 올바르지 않습니다.", 400);

    private final String code;
    private final String message;
    private final int status;

    ErrorCode(String code, String message, int status) {
        this.code = code;
        this.message = message;
        this.status = status;
    }

}
