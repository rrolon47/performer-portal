package com.thedancingbeartribe.performerportal.controllers;

import com.thedancingbeartribe.performerportal.modles.Event;
import com.thedancingbeartribe.performerportal.modles.Performer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    //lives at
    @GetMapping("application")
    public String perfromerFrom(Model model){
        model.addAttribute("title", "Performer Application");
        return "performers/application";
    }
    //lives at /performers/application handles post request
    @PostMapping("application")
    public String processPerformerForm(@RequestParam String performerName) {
        performers.add(new Performer(performerName));
        return "redirect:"; //tells browser to redirect to new path root path for contoller
    }

}
