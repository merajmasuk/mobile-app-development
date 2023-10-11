package com.example.busroutemanagement;

import java.util.List;

public class BusModal {
    private int id;
    private String busName;
    private String busStops;

    public BusModal(String busName, String busStops) {
        this.busName = busName;
        this.busStops = busStops;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBusName() {
        return busName;
    }

    public void setBusName(String busName) {
        this.busName = busName;
    }

    public String getBusStops() {
        return busStops;
    }

    public void setBusStops(String busStops) {
        this.busStops = busStops;
    }
}
