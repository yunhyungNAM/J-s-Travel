package com.YH.travelaccount.travel.mapper;

import com.YH.travelaccount.travel.domain.Travel;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TravelMapper {
    void insert(Travel travel);
}
