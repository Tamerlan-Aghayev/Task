package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "deactive")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Deactive {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



    @ManyToOne
    @JoinColumn(name = "employer_id")
    private DeactiveEmployer employer;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private DeactiveEmployee employee;

    @ManyToOne
    @JoinColumn(name = "contract_id")
    private DeactiveContract contract;
}
