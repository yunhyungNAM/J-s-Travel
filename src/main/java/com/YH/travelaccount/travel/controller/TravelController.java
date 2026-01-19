package com.YH.travelaccount.travel.controller;

import com.YH.travelaccount.travel.dto.TravelCreateRequest;
import com.YH.travelaccount.travel.dto.TravelListResponse;
import com.YH.travelaccount.travel.service.TravelService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/travels")
public class TravelController {
    private final TravelService travelService;

    @PostMapping("/create")
    public void createTravel(@RequestBody TravelCreateRequest request) {

        // 인증 붙기 전 임시 사용자
        Long mockUserId = 1L;

        travelService.createTravel(request, mockUserId);
    }

    @GetMapping("/list")
    public List<TravelListResponse> getTravels(@RequestParam("userId") Long userId) {
        return travelService.getTravels(userId);
    }
}
