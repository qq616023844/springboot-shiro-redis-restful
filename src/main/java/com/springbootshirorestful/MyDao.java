package com.springbootshirorestful;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MyDao extends JpaRepository<Student,Integer> {
}
