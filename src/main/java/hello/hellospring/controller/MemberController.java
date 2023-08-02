package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {
    private final MemberService memberService;

    @Autowired //맴버 서비스를 가져다가 자동으로 연결시켜준다.
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
