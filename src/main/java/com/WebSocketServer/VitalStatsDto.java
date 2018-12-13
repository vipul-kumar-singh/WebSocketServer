package com.WebSocketServer;

import java.util.Date;

public class VitalStatsDto {

    private int heart_rate;
    private int respiratory_rate;
    private double temperature;
    private int posture;
    private Date timestamp;

    public int getHeart_rate() {
        return heart_rate;
    }

    public void setHeart_rate(int heart_rate) {
        this.heart_rate = heart_rate;
    }

    public int getRespiratory_rate() {
        return respiratory_rate;
    }

    public void setRespiratory_rate(int respiratory_rate) {
        this.respiratory_rate = respiratory_rate;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public int getPosture() {
        return posture;
    }

    public void setPosture(int posture) {
        this.posture = posture;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

}