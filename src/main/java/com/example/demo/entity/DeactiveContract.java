package com.example.demo.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@DiscriminatorValue("DEACTIVE")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DeactiveContract extends BaseContract{
    private String terminateDate;
}
