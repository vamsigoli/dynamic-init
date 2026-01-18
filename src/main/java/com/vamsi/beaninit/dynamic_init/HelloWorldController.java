package com.vamsi.beaninit.dynamic_init;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HelloWorldController {

    private MessageService messageService;

    public HelloWorldController(MessageService messageService) {
        this.messageService = messageService;
    }

    
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World ! " + messageService.getMessage();

    }
}
