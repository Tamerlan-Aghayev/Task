package com.example.demo.repository;

import com.example.demo.entity.BaseEmployer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployerRepository extends JpaRepository<BaseEmployer, Long> {
}
