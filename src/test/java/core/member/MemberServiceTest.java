package core.member;


import core.AppConfig;
import hello.core.member.MemberService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MemberServiceTest {
   MemberService memberService;

   @BeforeEach
    public void beforeEach() {
       AppConfig appConfig = new AppConfig();
       memberService = appConfig.memberService();
   }
}
