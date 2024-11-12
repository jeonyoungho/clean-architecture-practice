package com.demo.cleanarchitecturepractice.member.adapter.out.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by jyh1004 on 2024. 11. 12.
 */

interface MemberJpaEntityRepository extends JpaRepository<MemberJpaEntity, Long> {
}
