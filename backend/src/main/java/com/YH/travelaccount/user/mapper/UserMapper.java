package com.YH.travelaccount.user.mapper;

import com.YH.travelaccount.user.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User findById(Long id);
}
