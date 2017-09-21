package com.pzhihao.Service.impl;

import com.pzhihao.Service.PeopleService;
import com.pzhihao.dao.PeopleMapper;
import com.pzhihao.domain.entity.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeopleServiceImpl implements PeopleService {

    @Autowired
    PeopleMapper peopleMapper;

    public People findById(int id) {
        return peopleMapper.findById(id);
    }
}
