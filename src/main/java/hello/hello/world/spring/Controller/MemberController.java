package hello.hello.world.spring.Controller;


import hello.hello.world.spring.Service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller //이 키워드를 보고 스프링이 아 내가 관리해야하는구나 라고 판단
public class MemberController {
    private final MemberService memberService;
    //new 로 많은 객체를 생성하지말고 하나 멤버 서비스 객체로 사용한다.

    @Autowired //쉽게 이해하면 연결해주는 역할
    public MemberController(MemberService memberService){
        this.memberService=memberService;
    }
    //Autowired + 생성자를 이용. 멤버 컨트롤러는 스프링 컨테이너가 뜰 때 생성된다. 그러면 생성자를 호출
    //생성자에 Autowired 키워드가 있으면 멤버서비스를 스프링이 스프링컨테이너에서 멤버서비스를 가져와서 연결한다.
    //이게 DI. 멤버 서비스는 스프링컨테이너에서 전달한다.
}
