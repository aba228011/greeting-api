package com.dar.greetingapi.controller;

import com.dar.greetingapi.model.GreetingModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @ResponseBody
    @GetMapping("/greeting")
    public GreetingModel greeting(@RequestParam(defaultValue = "World") String name){
        return new GreetingModel(String.format("Hello, %s!", name));
    }
}
