package hello.core;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.member.*;
import hello.core.order.Order;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OrderApp {
    public static void main(String[] args) {
        //MemberRepository와 DiscountPolicy의 구현체 생성
        MemberRepository memberRepository = new MemoryMemberRepository();
        DiscountPolicy discountPolicy = new FixDiscountPolicy();

        // OrderServiceImpl에 적절한 인자 전달
        OrderService orderService = new OrderServiceImpl(memberRepository, discountPolicy);


        long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        // MemberService.join(member); //memberService라는 변수는 존재하지 않으므로, 이 줄은 제거해야 한다.

        Order order = orderService.createOrder(memberId, "itemA", 10000);

        System.out.println("order = " + order);

    }
}
