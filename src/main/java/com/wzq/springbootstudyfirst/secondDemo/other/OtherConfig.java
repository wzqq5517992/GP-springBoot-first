package com.wzq.springbootstudyfirst.secondDemo.other;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wzq.Jolin
 * @company none
 * @create 2019-07-04 17:12
 */
@Configuration
public class OtherConfig {

    @Bean
    public  OtherBean otherBean(){
        return new OtherBean();
    }
}
