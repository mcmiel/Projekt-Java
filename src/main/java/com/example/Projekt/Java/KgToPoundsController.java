package com.example.Projekt.Java;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class KgToPoundsController {

    @GetMapping("/")
    public String showForm() {
        return "converter";
    }

    @PostMapping("/convert")
    public String convertKgToPounds(@RequestParam("kilograms") double kilograms, Model model) {
        double pounds = kilograms * 2.20462;
        model.addAttribute("kilograms", kilograms);
        model.addAttribute("pounds", pounds);
        return "converter";
    }
}
