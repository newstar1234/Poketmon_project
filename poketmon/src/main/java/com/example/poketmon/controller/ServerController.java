package com.example.poketmon.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class ServerController {
  
  @GetMapping("")
  public String hello() {
    return "Server On!!";
  }

}
