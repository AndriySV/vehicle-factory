package com.vehiclefactory.service;

import com.vehiclefactory.red.FooFormatter;
import com.vehiclefactory.red.Formatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FooService {
    @Autowired
    @Qualifier("barFormatter")
    private Formatter formatter;

    @Autowired
    private FooFormatter fooFormatterProp;

    private FooFormatter fooFormatterNewObj = new FooFormatter();;

    private FooFormatter fooFormatterSet;
    @Autowired
    public void setFooFormatterSet(FooFormatter fooFormatterSet) {
        this.fooFormatterSet = fooFormatterSet;
    }

    private FooFormatter fooFormatterConst;
    @Autowired
    public FooService(FooFormatter fooFormatterConst) {
        this.fooFormatterConst = fooFormatterConst;
    }

    public void service() {
        System.out.println(fooFormatterProp.format() + " property");

        System.out.println(fooFormatterNewObj.format() + " new object");

        System.out.println(fooFormatterSet.format() + " setter");

        System.out.println(fooFormatterConst.format() + " constructor");

        System.out.println(formatter.format() + " formatter with qualifier");
    }
}
