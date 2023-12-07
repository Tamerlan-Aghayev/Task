package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "active")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Active {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



    @ManyToOne
    @JoinColumn(name = "employer_id")
    private ActiveEmployer employer;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private ActiveEmployee employee;

    @ManyToOne
    @JoinColumn(name = "contract_id")
    private ActiveContract contract;
}
