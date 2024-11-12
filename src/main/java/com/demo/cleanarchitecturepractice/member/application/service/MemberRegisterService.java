package com.demo.cleanarchitecturepractice.member.application.service;

import com.demo.cleanarchitecturepractice.common.UseCase;
import com.demo.cleanarchitecturepractice.member.application.port.in.MemberRegisterCommand;
import com.demo.cleanarchitecturepractice.member.application.port.in.MemberRegisterUseCase;
import com.demo.cleanarchitecturepractice.member.application.port.out.MemberSavePersistencePort;
import com.demo.cleanarchitecturepractice.member.domain.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by jyh1004 on 2024. 11. 12.
 */

@RequiredArgsConstructor
@UseCase
@Transactional(readOnly = true)
class MemberRegisterService implements MemberRegisterUseCase {

    private final MemberSavePersistencePort memberSavePersistencePort;

    @Transactional
    @Override
    public void register(MemberRegisterCommand command) {
        Member member = Member.create(command.getName(), command.getEmployeeId());
        memberSavePersistencePort.save(member);
    }

}
