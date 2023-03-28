package me.songha.assignment.error;

import lombok.extern.slf4j.Slf4j;
import me.songha.assignment.voucher.VoucherNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;

@Slf4j
@RestControllerAdvice
public class ExceptionController {

    @ExceptionHandler(VoucherNotFoundException.class)
    public ResponseEntity<ErrorResponse> asf(VoucherNotFoundException e) {
        log.error("msg={}, id={}", e.getMessage(), e.getId());
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body((buildError(ErrorCode.VOUCHER_NOT_FOUND)));
    }

    private ErrorResponse buildError(ErrorCode errorCode) {
        return ErrorResponse.builder()
                .code(errorCode.getCode())
                .status(errorCode.getStatus())
                .message(errorCode.getMessage())
                .build();
    }

    private ErrorResponse buildFieldErrors(ErrorCode errorCode, List<ErrorResponse.FieldError> errors) {
        return ErrorResponse.builder()
                .code(errorCode.getCode())
                .status(errorCode.getStatus())
                .message(errorCode.getMessage())
                .errors(errors)
                .build();
    }
}
