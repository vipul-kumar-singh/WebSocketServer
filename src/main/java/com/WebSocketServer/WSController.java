package com.WebSocketServer;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WSController {

//    @MessageMapping("/vital")
//    @SendTo("/topic/messages")
//    public void receive(@RequestBody String vitalStatsDto) throws Exception {
//        System.out.println(vitalStatsDto);
//    }

    @MessageMapping("/vital")
    @SendTo("/topic/messages")
    public void receive(@RequestBody VitalStatsOutputDto vitalStatsDto) throws Exception {

        System.out.println(vitalStatsDto.getHeartRate()
                + ", " + vitalStatsDto.getRespiratoryRate()
                + ", " + vitalStatsDto.getPosture()
                + ", " + vitalStatsDto.getTemperature());

        vitalStatsDto.getVitalsConstants().entrySet().forEach(System.out::println);
    }
}