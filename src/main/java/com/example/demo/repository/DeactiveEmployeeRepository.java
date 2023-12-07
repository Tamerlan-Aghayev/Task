package com.example.demo.repository;

import com.example.demo.entity.DeactiveEmployee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeactiveEmployeeRepository extends JpaRepository<DeactiveEmployee, Long> {
}
