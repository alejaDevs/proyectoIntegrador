package com.proyectointregrador.ada.demo.controller.health;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class HealthController {

    @GetMapping()
    public String checkApi(){
        return "<h1>The Api is working ok!</h1>";
    }
}
