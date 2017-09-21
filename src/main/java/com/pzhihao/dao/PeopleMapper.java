package com.pzhihao.dao;

import com.pzhihao.domain.entity.People;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface PeopleMapper {
    @Select("Select * from people where id=#{id}")
    public People findById(@Param("id") int id);
}
