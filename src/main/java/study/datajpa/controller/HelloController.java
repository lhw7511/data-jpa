package study.datajpa.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import study.datajpa.entity.Member;
import study.datajpa.repository.MemberJpaRepository;

@RestController
@RequiredArgsConstructor
public class HelloController {

    private final MemberJpaRepository memberJpaRepository;

    @GetMapping("/hello")
    public String hello(){

        memberJpaRepository.find(1L);
        return "hello";
    }
}
