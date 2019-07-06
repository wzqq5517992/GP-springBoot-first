package com.wzq.springbootstudyfirst.firstDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

/**
 * @author wzq.Jolin
 * @company none
 * @create 2019-07-04 11:38
 */
@Configuration
public class DemoClass {

    public  void   say(){
        System.out.println("Say: hello wzq");
    }

}
