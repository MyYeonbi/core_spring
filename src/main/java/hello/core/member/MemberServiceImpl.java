package hello.core.member;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.OrderServiceImpl;

public class MemberServiceImpl implements MemberService{

    private final MemberRepository memberRepository;
    private final DiscountPolicy discountPolicy;

    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy
    }

    public MemberServiceImpl(MemberRepository memberRepository) {
     this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);

    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
