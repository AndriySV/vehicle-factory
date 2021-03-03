package com.vehiclefactory.red;

import org.springframework.stereotype.Component;

@Component("fooFormatter")
public class FooFormatter implements Formatter{
    public String format() {
        return "foo";
    }
}
