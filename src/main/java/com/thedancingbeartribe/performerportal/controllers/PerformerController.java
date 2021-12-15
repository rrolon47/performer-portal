package com.thedancingbeartribe.performerportal.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("performers")
public class PerformerController {

    @GetMapping
    public String displayPerformers(Model model) {
        List<String> performers = new ArrayList<>();
        performers.add("Lana");
        performers.add("Whitney");
        performers.add("Victoria");
        performers.add("Nicole");
        model.addAttribute("performers", performers);
        return "performers/index";
    }

}
