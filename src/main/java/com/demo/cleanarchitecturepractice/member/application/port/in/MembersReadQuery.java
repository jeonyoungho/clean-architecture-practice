package com.demo.cleanarchitecturepractice.member.application.port.in;

import com.demo.cleanarchitecturepractice.member.domain.Member;

import java.util.List;

/**
 * Created by jyh1004 on 2024. 11. 12.
 */

public interface MembersReadQuery {
    List<Member> readAll();
}
