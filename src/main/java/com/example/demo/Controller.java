package com.example.demo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.Date;

@RestController
public class Controller {

    @RequestMapping("/current-date")
    public LocalDate date() {
        LocalDate today = LocalDate.now();
        return today;
    }





}
