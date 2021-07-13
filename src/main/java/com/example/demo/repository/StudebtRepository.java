package com.example.demo.repository;

import com.example.demo.Entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudebtRepository extends JpaRepository<StudentEntity,Long> {
}
