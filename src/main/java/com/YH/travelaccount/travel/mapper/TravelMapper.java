package com.YH.travelaccount.travel.mapper;

import com.YH.travelaccount.travel.domain.Travel;
import com.YH.travelaccount.travel.dto.TravelListResponse;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TravelMapper {
    void insert(Travel travel);

    List<TravelListResponse> findTravelByUserId(
            @Param("userId") Long userId
    );
}
