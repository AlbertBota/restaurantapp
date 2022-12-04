package com.example.albertbcameron_comp304sec401_lab5;

public class Restaurant {

    public int id;
    public String name;
    public String type;
    public String address;
    public double latitude;
    public double longitude;
    public int imageId;

    public Restaurant (int id, String name, String type, String address, double latitude, double longitude, int imageId)
    {
        this.id = id;
        this.name = name;
        this.type = type;
        this.address = address;
        this.latitude = latitude;
        this.longitude = longitude;
        this.imageId = imageId;
    }
}
