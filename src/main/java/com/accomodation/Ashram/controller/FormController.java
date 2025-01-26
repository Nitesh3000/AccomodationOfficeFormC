package com.accomodation.Ashram.controller;

import com.accomodation.Ashram.model.FormData;
import com.accomodation.Ashram.service.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FormController {

    @Autowired
    private FormService formService;


    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("formData", new FormData());
        return "index"; 
    }

   
    @PostMapping("/submit")
    public String submitForm(FormData formData, Model model) {
        formService.saveFormData(formData); 
        model.addAttribute("message", "Form submitted successfully!");
        return "redirect:/result"; 
}
