package com.thedancingbeartribe.performerportal.modles;

public class Performer {

    private String name;

    public Performer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
