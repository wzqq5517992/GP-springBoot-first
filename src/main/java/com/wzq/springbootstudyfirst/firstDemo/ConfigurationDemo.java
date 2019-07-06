package com.wzq.springbootstudyfirst.firstDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

/**
 * @author wzq.Jolin
 * @company none
 * @create 2019-07-04 13:56
 */
@Service
public class ConfigurationDemo {
    /**
     * 单例模式，将DemoClass交给spring进行托管
     * @return
     */
    @Bean
    public  DemoClass demoClass(){
        return  new DemoClass();
    }
}
