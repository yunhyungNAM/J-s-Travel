package com.YH.travelaccount.user.mapper;

import com.YH.travelaccount.user.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    void findById_정상조회() {
        // given
        Long userId = 1L; // DB에 실제 존재하는 ID로 바꿔줘

        // when
        User user = userMapper.findById(userId);

        // then
        assertThat(user).isNotNull();
        assertThat(user.getId()).isEqualTo(userId);

        // 확인용 출력
        System.out.println("user = " + user);
    }
}
