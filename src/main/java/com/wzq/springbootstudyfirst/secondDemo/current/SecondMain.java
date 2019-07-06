package com.wzq.springbootstudyfirst.secondDemo.current;

import com.wzq.springbootstudyfirst.firstDemo.ConfigurationDemo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author wzq.Jolin
 * @company none
 * @create 2019-07-04 17:06
 */
public class SecondMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext springConfig = new AnnotationConfigApplicationContext(SpringConfig.class);
        String[] names = springConfig.getBeanDefinitionNames();
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
