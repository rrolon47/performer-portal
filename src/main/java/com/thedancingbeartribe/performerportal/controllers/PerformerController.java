package com.thedancingbeartribe.performerportal.controllers;

import com.thedancingbeartribe.performerportal.modles.Performer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("performers")
public class PerformerController {

    private static List<Performer> performers = new ArrayList<>();

    @GetMapping
    public String displayPerformers(Model model) {
        model.addAttribute("title","All Performers");
        model.addAttribute("performers", performers);
        return "performers/index";
    }

}
