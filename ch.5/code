package kr.co.hambit;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 이 자체가 컨트롤러
public class SimpleRestController {

    @RequestMapping("/") // 특정 URL 요청을 메서드와 매핑 ("") : "경로"라고 함
    public String hello() {
        return "Hello";

        //스프링부트 프로젝트를 실행하면, 내장된 서버(Tomcat 등)가 기본적으로 **http://localhost:8080**에서 작동합니다.
        //localhost: 현재 실행 중인 컴퓨터(로컬 머신)에서 동작함을 의미.
        //8080: 기본적으로 사용하는 포트 번호

    }

    @RequestMapping("/bye")
    public String bye() {
        return "Bye";
    }


   /* @RequestMapping("/bye")
    public String bye2() {
        return "Bye2";
        //하나의 경로에 2가지 이상의 컨트롤러가 부여되면 실행불가. (#)어떤 경로로 연결할지 모호해지기 때문.
     }*/

    @RequestMapping("/html")
    public String html() {
        return "Hello <strong>BackEnd</strong>";
        //html로 작성한 코드도 출력화면에 반영이 됨
    }

}
