package com.study.mybatis;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class TimeMapper {
    
    private final static String NAME_SPACE = TimeMapper.class.getName() + "."; 
    private final SqlSession sqlSession;
    
//    @Select("select now()")
//    public String getTime();
    
    public String getTimeXML( ) {
        return sqlSession.selectOne(NAME_SPACE + "getTimeXML");
    };
}
