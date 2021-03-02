package com.vehiclefactory.service;

import com.vehiclefactory.red.FooFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FooService {

    @Autowired
    private FooFormatter fooFormatter;

    private FooFormatter fooFormatter2;

    public void service() {
        String format = fooFormatter.format();
        System.out.println(format);

        fooFormatter2 = new FooFormatter();
        System.out.println(fooFormatter2.format() + " 2 !!!!");
    }
}
