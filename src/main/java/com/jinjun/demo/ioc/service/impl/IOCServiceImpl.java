package com.jinjun.demo.ioc.service.impl;


import com.jinjun.demo.ioc.service.IOCService;

/**
 * @Author JASON
 * @Description:
 * @Date 12:11 2020-01-19
 **/
public class IOCServiceImpl implements IOCService {

    @Override
    public String helloIoc() {
        return "Hello,IOC";
    }
}
