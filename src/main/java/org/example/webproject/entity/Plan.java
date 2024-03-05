package org.example.webproject.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Table(name = "plan")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Plan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//    private String title;
//    private BigDecimal amountMin;
//    private BigDecimal amountMax;
//    private Double percent;
//    private Integer term;
//    @Column(name = "capitalization")
//    private Boolean cap;
//    @Column(name = "capitalization_type")
//    private String capType;
//    private String type;
//    private Boolean isReturnable;
}
