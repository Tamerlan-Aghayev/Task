package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "invalidation")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Invalidation {
    @Id
    private Long id;
    private String label;
    private String description;
}
