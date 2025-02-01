package hello.core;

import hello.core.discount.OrderService;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;

public class AppConfig {

    public MemberService memberService () {
        return new MemberServiceImpl();
    }


}
