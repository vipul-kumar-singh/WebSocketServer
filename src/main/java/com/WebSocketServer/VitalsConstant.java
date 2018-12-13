package com.WebSocketServer;

import java.util.stream.Stream;

public enum VitalsConstant {


    CRITICAL("CRITICAL"), NON_CRITICAL("NON-CRITICAL"), HEALTHY("HEALTHY");

    private String value;


    public String getValue() {
        return value;
    }


    VitalsConstant(String value) {
        this.value = value;
    }

    public static String getEnumByString(String code) {
        return Stream.of(VitalsConstant.values()).filter(x -> x.value.equalsIgnoreCase(code)).map(VitalsConstant::name)
                .findAny().orElse("No Such Enum Exists!");
    }
}
