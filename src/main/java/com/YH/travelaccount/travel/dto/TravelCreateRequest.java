package com.YH.travelaccount.travel.dto;

import lombok.Getter;

import java.time.LocalDate;

@Getter
public class TravelCreateRequest {
    private String title;
    private LocalDate startDate;
    private LocalDate endDate;
}
