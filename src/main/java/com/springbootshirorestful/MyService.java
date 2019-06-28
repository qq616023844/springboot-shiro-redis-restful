package com.springbootshirorestful;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MyService {
    @Resource
    private MyDao myDao ;

    @Cacheable(value = "studentCache")
    public String getStudent(int id){
        Student student = myDao.getStudent(id);
        return JSON.toJSONString(student);
    }

    @CacheEvict(value = "studentCache")
    public String removeStudent(int id){
        return "88777";
    }

}
