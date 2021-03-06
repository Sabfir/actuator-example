package com.opinta.health.actuatorexample;


import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.Status;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id = "opinta-check")
public class CustomEndpoint {

    @ReadOperation
//    @Bean
    public CustomCheckDto customEndpointBean() {
        // some check
//        if (true) {
//            return new Health.Builder(Status.UNKNOWN).build();
//        } else {
//            return new Health.Builder(Status.DOWN).build();
//        }

        return new CustomCheckDto(Status.DOWN, "Who is responsible???", "Misha");
    }
}
