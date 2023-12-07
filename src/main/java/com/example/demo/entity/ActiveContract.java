package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@DiscriminatorValue("ACTIVE")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ActiveContract extends BaseContract{

    private String signDate;
    private String insertDate;
    private String nextEndDate;

    @ManyToOne
    @JoinColumn(name = "period_type_id")
    private PeriodType periodType;
    private String number;

    @ManyToOne
    @JoinColumn(name = "status_id")
    private ContractStatus status;

    @ManyToOne
    @JoinColumn(name = "invalidation_id")
    private Invalidation invalidation;
}
