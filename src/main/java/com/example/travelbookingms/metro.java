package com.example.travelbookingms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
@RestController

public class metro {
    @GetMapping("/mymetro")
    public String getData() {
        return "Book you metro";
    
}
}
