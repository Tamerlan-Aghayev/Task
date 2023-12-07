package com.example.demo.repository;

import com.example.demo.entity.FullResponse;
import com.example.demo.entity.Response;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResponseRepository extends JpaRepository<Response, Long> {
}
