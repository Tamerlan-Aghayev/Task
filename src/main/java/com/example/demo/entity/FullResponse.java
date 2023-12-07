package com.example.demo.entity;

import lombok.*;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "full_response")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FullResponse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String pin;
    @ManyToOne
    @JoinColumn(name = "status_id")
    private Status status;


    private String requestIdentifier;

    @ManyToOne
    @JoinColumn(name = "response_id")
    private Response response;


}
