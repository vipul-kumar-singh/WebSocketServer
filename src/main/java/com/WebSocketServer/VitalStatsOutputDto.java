package com.WebSocketServer;


import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public final class VitalStatsOutputDto {

    private int heartRate;
    private int respiratoryRate;
    private double temperature;
    private int posture;
    private Date timeStamp;

    public Map<Vitals, VitalsConstant> getVitalsConstants() {
        return vitalsConstants;
    }

    public Map<Vitals, VitalsConstant> vitalsConstants = new HashMap<>();

    public void setVitalsConstants(Map<Vitals, VitalsConstant> vitalsConstants) {
        this.vitalsConstants = vitalsConstants;
    }


    private VitalStatsOutputDto() {
    }

    private static volatile VitalStatsOutputDto instance;
    private static Object object = new Object();


    public static VitalStatsOutputDto getInstance() {
        VitalStatsOutputDto result = instance;
        if (result == null) {
            synchronized (object) {
                result = instance;
                if (result == null)
                    instance = result = new VitalStatsOutputDto();
            }
        }
        return result;
    }


    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public int getRespiratoryRate() {
        return respiratoryRate;
    }

    public void setRespiratoryRate(int respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
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

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }


}
