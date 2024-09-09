package com.example.my_employee.entitiy;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "promotions")
@Setter
@Getter
public class PromotionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id", referencedColumnName = "id", nullable = false)
    private EmployeeEntity employee;

    @Column(name = "promotion_date", nullable = false)
    @JsonProperty("promotion_date")
    private LocalDate promotion_date;

    @Column(name = "new_salary", nullable = false)
    @JsonProperty("new_salary")
    private BigDecimal new_salary;

}
