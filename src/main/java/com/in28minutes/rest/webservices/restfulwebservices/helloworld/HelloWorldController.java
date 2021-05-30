package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

import com.in28minutes.rest.webservices.restfulwebservices.helloworld.HelloWorldBean;
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

    @GetMapping(path = "/hello-world-bean-new")
    public HelloWorldBean newHelloWorldBean()
    {
        return new HelloWorldBean("Hello World", "new hello world");
    }
    //hello-world/path-variable/in28minutes
    @GetMapping(path = "/hello-world/path-variable/{name}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name)
    {
        return new HelloWorldBean(String.format("Hello World, %s",name));
    }

}
