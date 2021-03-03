package com.vehiclefactory.red;

import org.springframework.stereotype.Component;

@Component("fooFormatter")
public class FooFormatter implements Formatter{
    public String format() {
        LOGGER.info("start foo format");
        return "foo";
    }
}
