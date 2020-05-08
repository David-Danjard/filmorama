package com.david.danjard.filmorama.model;

public class Film {

    private long id;
    private String title;
    private String synopsis;
    private double average;

    public Film() {
    }

    public Film(long id, String title, String synopsis, double average) {
        this.id = id;
        this.title = title;
        this.synopsis = synopsis;
        this.average = average;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }
}
