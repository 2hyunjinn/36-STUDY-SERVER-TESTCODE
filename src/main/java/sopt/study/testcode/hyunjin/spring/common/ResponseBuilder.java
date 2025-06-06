package sopt.study.testcode.hyunjin.spring.common;

import org.springframework.http.ResponseEntity;

public class ResponseBuilder {

    public static <T> ResponseEntity<ApiResponse<T>> ok(T data) {
        return ResponseEntity.ok(ApiResponse.success(ResponseSuccess.OK, data));
    }

    public static <T> ResponseEntity<ApiResponse<T>> created(T data) {
        return ResponseEntity.ok(ApiResponse.success(ResponseSuccess.CREATED, data));
    }

    public static ResponseEntity<ApiResponse<Void>> error(ResponseError responseError) {
        return ResponseEntity.status(responseError.getCode())
                .body(ApiResponse.error(responseError));
    }
}