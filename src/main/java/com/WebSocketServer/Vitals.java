package com.WebSocketServer;

import java.util.stream.Stream;

public enum Vitals {

    TEMPERATURE("Temperature"), RESPIRATORY_RATE("RespiratoryRate"), HEART_RATE("HeartRate");

    private String value;


    public String getValue() {
        return value;
    }


    Vitals(String value) {
        this.value = value;
    }

    public static String getEnumByString(String code) {
        return Stream.of(Vitals.values()).filter(x -> x.value.equalsIgnoreCase(code)).map(Vitals::name)
                .findAny().orElse("No Such Enum Exists!");
    }
}
