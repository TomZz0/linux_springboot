package com.example.linux_springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wzh
 * @date 2023年04月17日 22:12
 * Description:
 */

@RestController
@RequestMapping("hello")
public class Controller1 {
    @GetMapping
    public String say(){
        System.out.println("hello linux_springboot");
        return "your boot is successfully in linux";
    }
}
