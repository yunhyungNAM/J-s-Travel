package com.YH.travelaccount.user.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@ToString
public class User {

    private Long id;

    private String email;

    private String password;

    private String name;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private Boolean isActive;
}
