package com.sinhvien.khachsan.models;

//add all the missing importstreams
import com.google.gson.annotations.SerializedName;

public class Location {
    private int locationId;
    private String locationName;
    private double locationLat;
    private double locationLong;

    public Location(int locationId, String locationName, double locationLat, double locationLong) {
        this.locationId = locationId;
        this.locationName = locationName;
        this.locationLat = locationLat;
        this.locationLong = locationLong;
    }

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public double getLocationLat() {
        return locationLat;
    }

    public void setLocationLat(double locationLat) {
        this.locationLat = locationLat;
    }

    public double getLocationLong() {
        return locationLong;
    }

    public void setLocationLong(double locationLong) {
        this.locationLong = locationLong;
    }
}
//add the following annotations to the class