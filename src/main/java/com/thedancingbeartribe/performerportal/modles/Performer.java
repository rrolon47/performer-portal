package com.thedancingbeartribe.performerportal.modles;

import java.util.Objects;

public class Performer {

    private int id;
    private static int nextId = 1;

    private String name;

    public Performer(String name) {

        this.name = name;
        this.id = nextId;
        nextId++;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Performer performer = (Performer) o;
        return id == performer.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
