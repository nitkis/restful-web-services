package com.in28minutes.rest.webservices.restfulwebservices;

import org.springframework.web.bind.annotation.*;

//controller
@RestController
public class HelloWorldController {

//    get
//    URI - /hello-world
//    method -"Hello World"
    @RequestMapping(method = RequestMethod.GET, path = "/hello-world")
    public String helloWorld()
    {
        return "Hello World";
    }
//    hello-world-bean
    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean()
    {
        return new HelloWorldBean("Hello World");
    }

    //hello-world/path-variable/in28minutes
    @GetMapping(path = "/hello-world/path-variable/{name}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name)
    {
        return new HelloWorldBean(String.format("Hello World, %s",name));
    }

}
