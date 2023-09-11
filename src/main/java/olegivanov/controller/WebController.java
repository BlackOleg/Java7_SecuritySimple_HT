package olegivanov.controller;


import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
    @GetMapping("/")
    public String hello() {
        return "Hello everybody! This is free access address!";
    }

    @GetMapping("/hi")
    public String hello2() {
        return "You got it! This is free access endpoint!";
    }

    @GetMapping("/zone1")
    public String zone1() {
        return "This is zone #1";
    }

    @GetMapping("/zone2")
    public String zone2() {
        return "This is zone #2";
    }

}
