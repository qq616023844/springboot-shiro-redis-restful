package com.springbootshirorestful;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MyDao extends JpaRepository<Student,Integer> {

    @Query(value = "select * from student where id=?1",
        nativeQuery = true)
    Student getStudent(int id);
}
