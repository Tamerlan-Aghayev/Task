package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@DiscriminatorValue("ACTIVE")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ActiveEmployer extends BaseEmployer {

    private int workerCount;
    private String phone;
    private String legalAddress;

    @ManyToOne
    @JoinColumn(name = "property_type_id")
    private PropertyType propertyType;
}
