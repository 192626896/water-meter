package com.example.watermeter.controller;

import com.example.watermeter.common.Result;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class TestController {

    @GetMapping("/test")
    public Result<String> test() {
        return Result.success("hello");
    }
}