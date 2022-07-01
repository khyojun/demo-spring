package com.example.demo.hellospringcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloPracticeController {

    @GetMapping("practice")
    public String Practice(Model model){
        model.addAttribute("data", "helloname");  // 데이터에서 
        return "practice";
    }


}
