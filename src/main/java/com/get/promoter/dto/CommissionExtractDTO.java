package com.get.promoter.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.get.promoter.model.SimpleRegistration;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CommissionExtractDTO {
    private Long id;
    private Long idIndicator;
    private String name;
    private BigDecimal valueReceived;
    private BigDecimal valuePending;
    private String document;
}