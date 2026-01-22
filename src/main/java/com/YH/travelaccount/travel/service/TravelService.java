package com.YH.travelaccount.travel.service;

import com.YH.travelaccount.travel.domain.Travel;
import com.YH.travelaccount.travel.dto.TravelCreateRequest;
import com.YH.travelaccount.travel.dto.TravelListResponse;
import com.YH.travelaccount.travel.mapper.TravelMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TravelService {
    private final TravelMapper travelMapper;

    public void createTravel(TravelCreateRequest request, Long userId) {

        Travel travel = new Travel(
                request.getTitle(),
                request.getStartDate(),
                request.getEndDate(),
                userId
        );

        travelMapper.insert(travel);

        // 다음 단계에서 여기서 user_travel insert 예정
    }

    public List<TravelListResponse> getTravels(Long userId) {
        return travelMapper.findTravelByUserId(userId);
    }
}
