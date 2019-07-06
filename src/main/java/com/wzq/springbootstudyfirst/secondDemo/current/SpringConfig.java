package com.wzq.springbootstudyfirst.secondDemo.current;

import com.wzq.springbootstudyfirst.secondDemo.other.OtherConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author wzq.Jolin
 * @company none
 * @create 2019-07-04 17:03
 */
@Import(OtherConfig.class)
@Configuration
public class SpringConfig {

    @Bean
    public  DefaultBean defaultBean(){
        return new DefaultBean();
    }
}
