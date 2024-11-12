package com.demo.cleanarchitecturepractice.member.adapter.in;

import com.demo.cleanarchitecturepractice.common.WebAdapter;
import com.demo.cleanarchitecturepractice.member.adapter.in.rqrs.MemberRegisterRq;
import com.demo.cleanarchitecturepractice.member.adapter.in.rqrs.MembersReadRs;
import com.demo.cleanarchitecturepractice.member.application.port.in.MemberRegisterCommand;
import com.demo.cleanarchitecturepractice.member.application.port.in.MemberRegisterUseCase;
import com.demo.cleanarchitecturepractice.member.application.port.in.MembersReadQuery;
import com.demo.cleanarchitecturepractice.member.domain.EmployeeId;
import com.demo.cleanarchitecturepractice.member.domain.Member;
import com.demo.cleanarchitecturepractice.member.domain.MemberName;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by jyh1004 on 2024. 11. 12.
 */

@WebAdapter
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/members")
public class MemberController {

    private final MemberRegisterUseCase memberRegisterUseCase;
    private final MembersReadQuery membersReadQuery;

    @PostMapping
    void registerMember(@RequestBody MemberRegisterRq rq) {
        MemberRegisterCommand command = new MemberRegisterCommand(MemberName.from(rq.getName()),
                                                                  EmployeeId.from(rq.getEmployeeId()));
        memberRegisterUseCase.register(command);
    }

    @GetMapping
    ResponseEntity<MembersReadRs> readAll() {
        List<Member> members = membersReadQuery.readAll();

        return ResponseEntity.ok(MembersReadRs.from(members));
    }
}
