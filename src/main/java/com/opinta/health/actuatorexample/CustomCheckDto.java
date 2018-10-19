package com.opinta.health.actuatorexample;

import org.springframework.boot.actuate.health.Status;

public class CustomCheckDto {
    private Status status;
    private String statistic;
    private String responsible;

    public CustomCheckDto() {
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public CustomCheckDto(Status status, String statistic, String responsible) {
        this.status = status;
        this.statistic = statistic;
        this.responsible = responsible;
    }

    public String getStatistic() {
        return statistic;
    }

    public void setStatistic(String statistic) {
        this.statistic = statistic;
    }

    public String getResponsible() {
        return responsible;
    }

    public void setResponsible(String responsible) {
        this.responsible = responsible;
    }
}
