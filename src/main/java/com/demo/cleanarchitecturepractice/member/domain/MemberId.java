package com.demo.cleanarchitecturepractice.member.domain;

import lombok.Getter;

/**
 * Created by jyh1004 on 2024. 11. 12.
 */

@Getter
public class MemberId {

    private final Long value;

    private MemberId(Long value) {
        this.value = value;
    }

    public static MemberId from(Long value) {
        return new MemberId(value);
    }

    public static MemberId empty() {
        return new MemberId(null);
    }
}
