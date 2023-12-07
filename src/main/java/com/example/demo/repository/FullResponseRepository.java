package com.example.demo.repository;

import com.example.demo.entity.FullResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FullResponseRepository extends JpaRepository<FullResponse, Long> {
}
