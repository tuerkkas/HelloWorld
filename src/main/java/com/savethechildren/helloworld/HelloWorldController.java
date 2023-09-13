package com.savethechildren.helloworld;


import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

    @GetMapping(value = "/hello-world",produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody String HelloWorld(){

        return "Hello World";

    }
}
