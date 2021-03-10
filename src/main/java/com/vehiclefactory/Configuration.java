package com.vehiclefactory;

import com.outsidesscope.OutsideScopeBeanExample;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    public OutsideScopeBeanExample getOutsideScopeBeanExample() {
        return new OutsideScopeBeanExample();
    }
}