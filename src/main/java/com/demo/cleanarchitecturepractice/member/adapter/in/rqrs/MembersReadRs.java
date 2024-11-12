package com.demo.cleanarchitecturepractice.member.adapter.in.rqrs;

import com.demo.cleanarchitecturepractice.member.domain.Member;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

/**
 * Created by jyh1004 on 2024. 11. 12.
 */

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class MembersReadRs {

    private List<MemberDto> members;

    public static MembersReadRs from(List<Member> members) {
        return new MembersReadRs(members.stream()
                                        .map(MemberDto::from)
                                        .toList());
    }

    @Getter
    private static class MemberDto {
        private Long id;
        private String name;
        private String employeeId;

        public static MemberDto from(Member member) {
            MemberDto memberDto = new MemberDto();
            memberDto.id = member.getId().getValue();
            memberDto.name = member.getName().getValue();
            memberDto.employeeId = member.getEmployeeId().getValue();
            return memberDto;
        }
    }

}
