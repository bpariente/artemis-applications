package com.artemis.applications.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class ClientController {

    @RequestMapping("/clientes")
    public String hello(){
        return "hello";

    }


}
