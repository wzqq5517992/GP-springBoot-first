package com.wzq.springbootstudyfirst.firstDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author wzq.Jolin
 * @company none
 * @create 2019-07-04 16:00
 */
@ComponentScan("com.wzq.springbootstudyfirst")
public class ConfigurationMain {
    public static void main(String[] args) {
        //使用springioc中的DL（依赖查找调用）
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationDemo.class);
        DemoClass demoClass = context.getBean(DemoClass.class);
        demoClass.say();


        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(ConfigurationMain.class);
        String[] names = annotationConfigApplicationContext.getBeanDefinitionNames();
        for (int i = 0; i < names.length; i++) {

            System.out.println(names[i]);
        }

    }
}
