package com.jinjun.demo.ioc;

import com.jinjun.demo.ioc.service.IOCService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author JASON
 * @Description:
 * @Date 12:11 2020-01-19
 **/
public class IOCDemo {
    public static void main (String args[]){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:application-ioc.xml");
        IOCService iocService=context.getBean(IOCService.class);
        System.out.println(iocService.helloIoc());
    }
}
