package com.demo.cleanarchitecturepractice.member.domain;

import lombok.Getter;

/**
 * Created by jyh1004 on 2024. 11. 12.
 */

@Getter
public class EmployeeId {

    private final String value;

    private EmployeeId(String value) {
        this.value = value;
    }

    public static EmployeeId from(String value) {
        // 검증 로직 (ex. 글자수 제한 등)
        return new EmployeeId(value);
    }

}
