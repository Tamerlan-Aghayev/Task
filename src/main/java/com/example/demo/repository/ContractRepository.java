package com.example.demo.repository;

import com.example.demo.entity.ActiveContract;
import com.example.demo.entity.ActiveEmployee;
import com.example.demo.entity.BaseContract;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContractRepository extends JpaRepository<BaseContract, Long> {
}
