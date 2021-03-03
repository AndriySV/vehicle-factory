package com.vehiclefactory.red;

import org.springframework.stereotype.Component;

@Component("barFormatter")
public class BarFormatter implements Formatter {
    @Override
    public String format() {
        LOGGER.info("start bar format");
        return "bar";
    }
}
