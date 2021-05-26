package org.launchcode.hellospring.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@ResponseBody
@RequestMapping("hello")
public class HelloController {


//    @GetMapping("hello")
//    @ResponseBody
//    public String hello(){
//        return "Hello, Spring!";
//
//    }
    //Handle request at path /hello
    @GetMapping("goodbye")
    public String goodbye(){
        return "Goodbye, Spring!";

    }

    //Handle request of the form /hello?name = LaunchCode.
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "hello")
    @ResponseBody
    public String helloWithQueryParam(@RequestParam String name){

        return "Hello, " + name + "!";
    }

    //Handles the request of the form /hello/LaunchCode
    @GetMapping("hello/{name}")
    @ResponseBody
    public String helloWithPathParam(@PathVariable String name) {

        return "Hello, " + name + "!";
    }

    //Displaying a Form
    @GetMapping("form")
    public String helloForm() {

        return "form";
    }

}
