package com.demo.cleanarchitecturepractice.member.application.port.out;

import com.demo.cleanarchitecturepractice.member.domain.Member;

/**
 * Created by jyh1004 on 2024. 11. 12.
 */

public interface MemberSavePersistencePort {

    void save(Member member);
}
