package com.test.springtest.repository;

import com.test.springtest.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member); // 회원이 저장소에 저장
    Optional<Member> findById(Long id); // 회원을 아이디로 찾기
    Optional<Member> findByName(String name); // 회원을 이름으로 찾기
    List<Member> findAll(); // 지금까지 저장된 모든 회원 리스트 반환
}
