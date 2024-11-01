package hello.core;

import hello.core.member.*;


public class MemberApp {

    public static void main(String[] args) {
       MemberService memberService = new MemberServiceImpl(new MemoryMemberRepository());
       Member member = new Member(1L, "member A", Grade.VIP);
       memberService.join(member);

       Member findMember = memberService.findMember(1L);
        System.out.println("new member = " + member.getName());
        System.out.println("findMember = " + findMember.getName());

    }
}
