package com.example.healthcare.controller;

import com.example.demo.healthCare.model.*;
import com.example.demo.healthCare.repository.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/register")
    public String showRegisterForm(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute User user) {
        userRepository.save(user);
        return "redirect:/login";
    }

    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

    @PostMapping("/login")
    public String loginUser(@RequestParam String mobile, @RequestParam String password, Model model) {
        User user = userRepository.findByMobile(mobile);
        if (user != null && user.getPassword().equals(password)) {
            return "redirect:/patient-form";  // Success: redirect to patient form
        }
        model.addAttribute("error", "Invalid credentials");
        return "login";  // Failure: return to login page with error
    }
}
