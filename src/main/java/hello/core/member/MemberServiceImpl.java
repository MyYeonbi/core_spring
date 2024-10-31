package hello.core.member;

import hello.core.discount.DiscountPolicy;
import hello.core.order.OrderService;

public class MemberServiceImpl implements MemberService {
    // 또는 null로 초기화 가능
    private final MemberRepository memberRepository ;

    //생성자 주입
    public MemberServiceImpl(MemberRepository memberRepository) {

        this.memberRepository = memberRepository ;
    }

    public void join(Member member) {
        memberRepository.save(member);
    }

    public Member findMember(Long memberId) {

        return memberRepository.findById(memberId);
    }
}