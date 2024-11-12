package com.demo.cleanarchitecturepractice.member.application.service;

import com.demo.cleanarchitecturepractice.member.application.port.in.MembersReadQuery;
import com.demo.cleanarchitecturepractice.member.application.port.out.MembersReadPersistencePort;
import com.demo.cleanarchitecturepractice.member.domain.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by jyh1004 on 2024. 11. 12.
 */


@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class MembersReadQueryService implements MembersReadQuery {

    private final MembersReadPersistencePort membersReadPersistencePort;

    @Override
    public List<Member> readAll() {
        return membersReadPersistencePort.findAll();
    }
}
