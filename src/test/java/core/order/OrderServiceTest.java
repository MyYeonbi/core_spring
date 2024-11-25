package core.order;
import core.AppConfig;
import hello.core.discount.FixDiscountPolicy;
import hello.core.member.*;
import hello.core.order.Order;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import hello.core.member.MemberServiceImpl;


import static org.assertj.core.api.Assertions.assertThat;

public class OrderServiceTest {

   MemberService memberService = new MemberServiceImpl(new MemoryMemberRepository());
   OrderService orderService = new OrderServiceImpl(new MemoryMemberRepository(), new FixDiscountPolicy());

   @Test
    void createOrder() {
       long memberId = 1L;
       Member member = new Member(memberId, "memberA", Grade.VIP);
       memberService.join(member);

       Order order = orderService.createOrder(memberId, "itemA", 10000);

   }
}
