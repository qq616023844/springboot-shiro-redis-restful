package com.springbootshirorestful;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MyService {
    @Resource
    private MyDao myDao;

    public String getStudent(int id){
        Student student = myDao.getOne(id);
        return JSON.toJSONString(student);
    }
}
