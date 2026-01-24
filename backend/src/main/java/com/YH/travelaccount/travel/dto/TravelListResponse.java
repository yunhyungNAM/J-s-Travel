package com.YH.travelaccount.travel.dto;

import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
public class TravelListResponse {
    private Long travelId;
    private String name;
    private LocalDate startDate;
    private LocalDate endDate;
    private LocalDateTime createdAt;

    public TravelListResponse(
            Long travelId,
            String title,
            LocalDate startDate,
            LocalDate endDate,
            LocalDateTime createdAt
    ) {
        this.travelId = travelId;
        this.name = title;
        this.startDate = startDate;
        this.endDate = endDate;
        this.createdAt = createdAt;
    }
}
