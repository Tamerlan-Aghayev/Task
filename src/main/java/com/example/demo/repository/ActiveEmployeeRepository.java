package com.example.demo.repository;

import com.example.demo.entity.ActiveEmployee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActiveEmployeeRepository extends JpaRepository<ActiveEmployee, Long> {
}
