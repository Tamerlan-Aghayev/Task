package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@DiscriminatorValue("ACTIVE")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ActiveEmployee {
    private String name;
    private String surname;
    private String patronymic;
    private String phone;

    @ManyToOne
    @JoinColumn(name = "work_place_type_id")
    private WorkPlaceType workPlaceType;

    private String workPlace;
    private String positionLabourContract;

    @ManyToOne
    @JoinColumn(name = "work_casual_type_id")
    private WorkCasualType workCasualType;
    private String ssn;
}
