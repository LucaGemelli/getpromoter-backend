package com.get.promoter.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(exclude = {"indicated"})
@ToString(exclude = {"indicated"})
@Table(name = "commissionextract")
public class CommissionExtract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "valuereceived")
    private BigDecimal valueReceived;
    @Column(name = "valuepending")
    private BigDecimal valuePending;
    @Column(name = "document")
    private String document;
//    @ManyToOne
//    @JoinColumn(name = "indicator_id")
//    private SimpleRegistration indicated;
}
