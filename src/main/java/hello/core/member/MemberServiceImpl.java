package hello.core.member;

import hello.core.discount.DiscountPolicy;
import hello.core.order.OrderService;

public class MemberServiceImpl implements MemberService {
    // 또는 null로 초기화 가능
    private final MemberRepository memberRepository = new MemoryMemberRepository();

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository ;
    }
}
public class OrderServiceImpl implements OrderService {
    private final MemberRepository memberRepository ;
    private final DiscountPolicy discountPolicy ;

    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository ;
        this.discountPolicy = discountPolicy ;
    }
}