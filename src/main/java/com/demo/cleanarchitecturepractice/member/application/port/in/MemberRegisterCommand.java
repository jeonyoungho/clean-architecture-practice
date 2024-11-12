package com.demo.cleanarchitecturepractice.member.application.port.in;

import com.demo.cleanarchitecturepractice.common.SelfValidating;
import com.demo.cleanarchitecturepractice.member.domain.EmployeeId;
import com.demo.cleanarchitecturepractice.member.domain.MemberName;
import jakarta.validation.constraints.NotNull;
import lombok.EqualsAndHashCode;
import lombok.Value;

/**
 * Created by jyh1004 on 2024. 11. 12.
 */

@Value
@EqualsAndHashCode(callSuper = false)
public class MemberRegisterCommand extends SelfValidating<MemberRegisterCommand> {

    @NotNull
    private MemberName name;

    @NotNull
    private EmployeeId employeeId;

    public MemberRegisterCommand(MemberName name, EmployeeId employeeId) {
        this.name = name;
        this.employeeId = employeeId;

        this.validateSelf();
    }
}
