package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "work_casual_type")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class WorkCasualType {
    @Id
    private Long id;
    private String label;
    private String description;
}
