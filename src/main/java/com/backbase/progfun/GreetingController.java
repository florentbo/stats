package com.backbase.progfun;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Controller
public class GreetingController {

    @RequestMapping("/greeting")
    public @ResponseBody String greeting(@RequestParam(required = false, defaultValue = "World") String name) {
        Optional<String> test = Optional.ofNullable(name);
        return "Hello opt " + test;
    }

}
