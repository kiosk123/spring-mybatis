package com.study.mybatis;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
class TimeMapperTest {
    
    @Autowired
    private TimeMapper timeMapper;

    @DisplayName("1. @Select(query)로 값을 잘 가져오는 지 확인한다.")
    @Test
    void test1() {
        log.info("2020-12-24 차후에 고민.. 잘안됨...");
    }
    
    
    @DisplayName("2. XML 매퍼를 이용해서 값을 잘 가져오는 지 확인한다.")
    @Test
    void test2() {
        log.info("TIME : " + timeMapper.getTimeXML());
    }
}
