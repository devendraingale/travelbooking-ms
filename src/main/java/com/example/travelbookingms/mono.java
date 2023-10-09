package com.example.travelbookingms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
@RestController

public class mono {
    @GetMapping("/mymono")
    public String getData() {
        return "Book you mono";
    
}
}