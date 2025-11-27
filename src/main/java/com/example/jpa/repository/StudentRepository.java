package com.example.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpa.entity.student;

// DAO역활
// 기본적인 CRUD 메소드는 이미 정의되어 있다.
public interface StudentRepository extends JpaRepository<student,Long>{

}
