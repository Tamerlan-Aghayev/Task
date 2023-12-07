package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue("DEACTIVE")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeactiveEmployee extends BaseEmployee{

}
