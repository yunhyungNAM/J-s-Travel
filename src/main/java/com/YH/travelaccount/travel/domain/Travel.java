package com.YH.travelaccount.travel.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@ToString
public class Travel {
    private Long id;
    private String title;
    private LocalDate startDate;
    private LocalDate endDate;

    private Long createdBy;
    private LocalDateTime createdAt;

    private Long updatedBy;
    private LocalDateTime updatedAt;

    // 여행 생성용 생성자
    public Travel(String title, LocalDate startDate, LocalDate endDate, Long createdBy) {
        this.title = title;
        this.startDate = startDate;
        this.endDate = endDate;
        this.createdBy = createdBy;
    }
}
