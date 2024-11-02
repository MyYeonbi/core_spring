package hello.core.member;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MemberServiceTest {
    //리포지토리 인스턴스 생성
    MemberRepository memberRepository = new MemoryMemberRepository();

    //서비스에 리포지토리 전달
    MemberService memberService = new MemberServiceImpl(memberRepository);

    @Test
    void join() {
        //given
        Member member = new Member(1L, "member A", Grade.VIP);

        //when
        memberService.join(member);
        Member findMember = memberService.findMember(1L);

        //then
        Assertions.assertThat(member).isEqualTo(findMember);


    }
}
