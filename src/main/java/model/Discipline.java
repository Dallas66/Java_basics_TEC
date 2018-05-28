package model;

import java.util.Objects;

public class Discipline {

    private String name;
    private int durations;

    public Discipline(String name, Integer durations ) {
        this.name = name;
        this.durations = durations;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDurations() {
        return durations;
    }

    public void setDurations(int durations) {
        this.durations = durations;
    }


}
