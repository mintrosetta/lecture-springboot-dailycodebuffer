package com.dailycodebuffer.Springboottutorial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/helloworld")
@RestController // บอก spring ว่าจะใช้ class นี้เป็น Controller คอยจัดการกับ request และ response
public class HelloController {
    @RequestMapping(value = "", method = RequestMethod.GET) // ตั้งค่า url path และ request method ที่ method นี้จะทำงาน
    public String getAll() {
        return "Welcome to RESTful API";
    }
}
