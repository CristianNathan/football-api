package com.cristian.football_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeamController {
    @GetMapping("/test")
    public String test(){
        return "API fucionando";
    }
}
