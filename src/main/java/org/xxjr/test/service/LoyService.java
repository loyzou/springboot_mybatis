package org.xxjr.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xxjr.test.entity.Loy;
import org.xxjr.test.mapper.LoyMapper;

@Service
public class LoyService {

    @Autowired
    private LoyMapper loyMapper;

    public Loy queryName(String id){
        Loy result = loyMapper.queryName(id);
        return  result;
    }

    public String queryNameById(int id){
        String str = loyMapper.queryNameById(id);
        return  str;
    }
}
