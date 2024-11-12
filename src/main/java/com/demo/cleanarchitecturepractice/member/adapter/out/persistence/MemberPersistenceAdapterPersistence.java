package com.demo.cleanarchitecturepractice.member.adapter.out.persistence;

import com.demo.cleanarchitecturepractice.common.PersistenceAdapter;
import com.demo.cleanarchitecturepractice.member.application.port.out.MemberSavePersistencePort;
import com.demo.cleanarchitecturepractice.member.application.port.out.MembersReadPersistencePort;
import com.demo.cleanarchitecturepractice.member.domain.Member;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by jyh1004 on 2024. 11. 12.
 */

@RequiredArgsConstructor
@PersistenceAdapter
class MemberPersistenceAdapterPersistence implements MemberSavePersistencePort, MembersReadPersistencePort {

    private final MemberJpaEntityRepository memberJpaEntityRepository;
    private final MemberMapper memberMapper;

    @Override
    public void save(Member member) {
        memberJpaEntityRepository.save(memberMapper.mapToJpaEntity(member));
    }

    @Override
    public List<Member> findAll() {
        return memberJpaEntityRepository.findAll()
                                        .stream()
                                        .map(memberMapper::mapToDomainEntity)
                                        .collect(Collectors.toList());
    }
}
