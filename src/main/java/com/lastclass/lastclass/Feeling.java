package com.lastclass.lastclass;

public class Feeling {
    private String name;
    private String mood;
    private String thoughts;
    private String vent;

    public Feeling(String name, String mood, String thoughts, String vent) {
        this.name = name;
        this.mood = mood;
        this.thoughts = thoughts;
        this.vent = vent;
    }

    public String getName() { return name; }
    public String getMood() { return mood; }
    public String getThoughts() { return thoughts; }
    public String getVent() { return vent; }
}
