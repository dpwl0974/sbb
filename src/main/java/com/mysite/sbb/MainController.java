package com.mysite.sbb;

import org.springframework.stereotype.Controller;

@Controller
public class MainController {

    public void index() {
        System.out.println("index() 메서드 호출됨");
    }

    public void hello() {
        System.out.println("hello()메서드 호출됨");
    }
}
