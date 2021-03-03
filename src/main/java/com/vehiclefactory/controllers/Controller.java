package com.vehiclefactory.controllers;

import com.vehiclefactory.service.FooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    private FooService fooService;

    @GetMapping("vehicle-factory/format")
    public void format() {
        fooService.service();
    }


}
