package io.joalder.hotdog.customer.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @RequestMapping("/hello")
    public String greeting() {
        return "Hello Customer!";
    }
}
