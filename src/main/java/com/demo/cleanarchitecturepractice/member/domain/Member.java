package com.demo.cleanarchitecturepractice.member.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Created by jyh1004 on 2024. 11. 12.
 */

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Member {

    private final MemberId id;
    private final MemberName name;
    private final EmployeeId employeeId;

    public static Member create(MemberName name, EmployeeId employeeId) {
        return new Member(MemberId.empty(), name, employeeId);
    }

    public static Member of(MemberId id, MemberName name, EmployeeId employeeId) {
        return new Member(id, name, employeeId);
    }

}
