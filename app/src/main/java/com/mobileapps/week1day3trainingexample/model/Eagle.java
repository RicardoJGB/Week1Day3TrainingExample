package com.mobileapps.week1day3trainingexample.model;

public class Eagle extends Bird {

    private String name;
    private int lifespan;

    public Eagle(String name, int lifespan){
        this.name=name;
        this.lifespan=lifespan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLifespan() {
        return lifespan;
    }

    public void setLifespan(int lifespan) {
        this.lifespan = lifespan;
    }
}
