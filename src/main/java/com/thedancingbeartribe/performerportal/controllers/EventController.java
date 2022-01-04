package com.thedancingbeartribe.performerportal.controllers;

import com.thedancingbeartribe.performerportal.data.EventData;
import com.thedancingbeartribe.performerportal.modles.Event;
import org.apache.tomcat.util.digester.ArrayStack;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("events")
public class EventController {

    @GetMapping
    public String displayEvents(Model model){
        model.addAttribute("title","All Events");
        model.addAttribute("events", EventData.getAll());
        return "events/index";
    }

    //lives at /events/booking
    @GetMapping("booking")
    public String eventFrom(Model model){
        model.addAttribute("title", "Create Event Booking");
        return "events/booking";
    }
    //lives at /events/booking  handles post request
    @PostMapping("booking")
    public String processEventForm(@RequestParam String eventName) {
        EventData.add(new Event(eventName));
        return "redirect:"; //tells browser to redirect to new path root path for contoller
    }

}
