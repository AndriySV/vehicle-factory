package com.vehiclefactory.red;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface Formatter {
    Logger LOGGER = LoggerFactory.getLogger(Formatter.class);
    String format();
}
