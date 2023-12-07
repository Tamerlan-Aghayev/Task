package com.example.demo.repository;

import com.example.demo.entity.ActiveEmployee;
import com.example.demo.entity.Deactive;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeactiveRepository extends JpaRepository<Deactive, Long> {
}
