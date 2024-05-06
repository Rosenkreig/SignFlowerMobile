package com.example.myapplication;
import java.io.Serializable;

public class Zodiac implements Serializable{
    private String zodiac;
    private int zodiacim;
    private String zodiacdetails;

    public Zodiac(String name, int imageResource, String details) {
        this.zodiac = name;
        this.zodiacim = imageResource;
        this.zodiacdetails = details;
    }

    public String getName() {
        return zodiac;
    }

    public int getImageResource() {
        return zodiacim;
    }

    public String getDetails() {
        return zodiacdetails;
    }
}