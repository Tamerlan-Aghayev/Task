package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "contract_status")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContractStatus {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String label;
    private String description;
}
