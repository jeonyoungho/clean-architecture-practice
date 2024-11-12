package com.demo.cleanarchitecturepractice.member.adapter.out.persistence;

import com.demo.cleanarchitecturepractice.member.domain.EmployeeId;
import com.demo.cleanarchitecturepractice.member.domain.Member;
import com.demo.cleanarchitecturepractice.member.domain.MemberId;
import com.demo.cleanarchitecturepractice.member.domain.MemberName;
import org.springframework.stereotype.Component;

/**
 * Created by jyh1004 on 2024. 11. 12.
 */

@Component
class MemberMapper {

    Member mapToDomainEntity(MemberJpaEntity memberJpaEntity) {
        return Member.of(MemberId.from(memberJpaEntity.getId()),
                         MemberName.from(memberJpaEntity.getName()),
                         EmployeeId.from(memberJpaEntity.getEmployeeId()));
    }

    MemberJpaEntity mapToJpaEntity(Member member) {
        return new MemberJpaEntity(member.getId().getValue(),
                                   member.getName().getValue(),
                                   member.getEmployeeId().getValue());
    }
}
