package com.example.demo.repository;

import com.example.demo.entity.FullResponse;
import com.example.demo.entity.WorkCasualType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkCasualTypeRepository extends JpaRepository<WorkCasualType, Long> {
}
