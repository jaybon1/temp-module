package com.github.jaybon1.temp;

import org.springframework.stereotype.Component;

@Component
public class TempComponent {

    public String hello() {
        return "Hello, World!";
    }

    public String hello(String name) {
        return "Hello, " + name + "!";
    }

}
