package com.example.demo;


import org.springframework.web.bind.annotation.*;


@RestController
public class HelloController {
    

    @GetMapping("/Welcome")
    @ResponseBody
    public String Welcome(@RequestParam(required = false) String naam){

        return "Welcome " + naam ;
    }
}
