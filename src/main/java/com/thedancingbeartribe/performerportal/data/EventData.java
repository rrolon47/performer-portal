package com.thedancingbeartribe.performerportal.data;

import com.thedancingbeartribe.performerportal.modles.Event;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class EventData {

    //place for events
    private static final Map<Integer, Event> events = new HashMap<>();

    //get all events
    public static Collection<Event> getAll(){
        return events.values();
    }

    //get a single event
    public static Event getbyId(int id) {
        return events.get(id);
    }

    //add an event
    public static void add(Event event) {
        events.put(event.getId(), event);
    }

    //remove an event
    public static void remove(int id){
        events.remove(id);
    }


}
