package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "response")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Response {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "response", cascade = CascadeType.ALL)
    private List<Active> active;

    @OneToMany(mappedBy = "response", cascade = CascadeType.ALL)
    private List<Deactive> deactive;

}
