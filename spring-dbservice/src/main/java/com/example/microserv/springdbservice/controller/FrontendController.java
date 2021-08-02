package com.example.microserv.springdbservice.controller;

import com.example.microserv.springdbservice.config.DatabaseConnector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/hello")
public class FrontendController {
    @Autowired
    private DatabaseConnector dbconConnector;
    @RequestMapping(path = "/first")
    public String welcome(){
        Date dt = dbconConnector.getTimestamp();
        return "HElloji "+dt;
    }
}
