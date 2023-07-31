package hello.hellospring.service;

import hello.hellospring.domain.Member;
import hello.hellospring.repository.MemberRepository;
import hello.hellospring.repository.MemoryMemberRepository;

import java.util.List;
import java.util.Optional;

public class MemberService {
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    //1. 회원 서비스를 만들기 위해서 리포지토리를 선언한다.
    private final MemberRepository memberRepository;


    //2. 회원가입
    public Long join(Member member) {
        //2. 같은 이름이 있는 중복 회원 X
        validateDuplicateMember(member);
        //1. 회원을 저장한다.
        memberRepository.save(member);
        return member.getId();

    }

    private void validateDuplicateMember(Member member) {
        memberRepository.findByName(member.getName())
                .ifPresent(m -> {
                    throw new IllegalStateException("이미 존재하는 회원입니다.");
                });
    }

    //3. 전체 회원 조회
    public List<Member> findMembers() {
        return memberRepository.findAll();
    }

    public Optional<Member> findOne(Long memberId) {
        return memberRepository.findById(memberId);
    }

}
