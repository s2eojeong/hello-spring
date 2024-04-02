package hello.hellospring.domain;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {
    private final MemberService memberService;
    @Autowired // 스프링 컨테이너에 있는 멤버 서비스랑 연결을 시켜줌. 서비스랑 컨트롤러 연결.
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
