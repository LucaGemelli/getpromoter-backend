package com.get.promoter.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "commission")
public class Commission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "link")
    private String link;
    @Column(name = "code")
    private String code;
    @Column(name = "value")
    private BigDecimal value;
    @Column(name = "status")
    private String status;
}
