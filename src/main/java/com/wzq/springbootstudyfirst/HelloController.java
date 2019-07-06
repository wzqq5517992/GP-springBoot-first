package com.wzq.springbootstudyfirst;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wzq.Jolin
 * @company none
 * @create 2019-07-04 10:45
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello wzq";
    }

}
