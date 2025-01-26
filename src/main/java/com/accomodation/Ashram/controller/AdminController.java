package com.accomodation.Ashram.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.accomodation.Ashram.model.FormData;
import com.accomodation.Ashram.service.FormService;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private FormService formService;

    // Show all accommodations
    @GetMapping("/accommodations")
    public String listAccommodations(Model model) {
        model.addAttribute("accommodations", formService.getAllAccommodations());
        return "admin/accommodations"; // admin/accommodations.html will show the list of accommodations
    }

    // Show form for editing FormData
    @GetMapping("/accommodations/edit/{id}")
    public String showEditAccommodationForm(@PathVariable Long id, Model model) {
        Optional<FormData> accommodation = formService.getAccommodationById(id);
        model.addAttribute("accommodation", accommodation);
        return "admin/accommodationForm"; // admin/accommodationForm.html for editing
    }

    // Update existing accommodation
    @PostMapping("/accommodations/update/{id}")
    public String updateAccommodation(@PathVariable Long id, @ModelAttribute FormData accommodation) {
        accommodation.setId(id); 
        formService.saveAccommodation(accommodation);
        return "redirect:/admin/accommodations";
    }

    // Delete accommodation
    @GetMapping("/accommodations/delete/{id}")
    public String deleteAccommodation(@PathVariable Long id) {
        formService.deleteAccommodation(id);
        return "redirect:/admin/accommodations";
    }
}
