package com.demo.cleanarchitecturepractice.member.application.port.in;

/**
 * Created by jyh1004 on 2024. 11. 12.
 */

public interface MemberRegisterUseCase {
    void register(MemberRegisterCommand command);
}
