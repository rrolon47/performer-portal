package com.thedancingbeartribe.performerportal.controllers;

import org.apache.tomcat.util.digester.ArrayStack;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("events")
public class EventController {

    @GetMapping
    public String displayEvents(Model model){
        List<String> events = new ArrayList<>();
        events.add("Pyro");
        events.add("Backwoods");
        events.add("Dancefestopia");
        events.add("Witches Night Out");
        model.addAttribute("events", events);
        return "events/index";
    }

}
