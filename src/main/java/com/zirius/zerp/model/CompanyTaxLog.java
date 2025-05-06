package com.zirius.zerp.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "company_tax_log")
public class CompanyTaxLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer COMPANY_TAX_LOG_ID;

    private Integer SALARY_RUN_LOG_ID;

    private Integer COMPANY_ORGANIZATION_TYPE_ID;

    private Integer ZONE_TYPE_ID;

    private BigDecimal BASIS_AMOUNT;

    private BigDecimal PERCENTAGE_VALUE;

    private Boolean IS_FINANCIAL_DIFFICULTY_ENABLED;

    private Integer COMPANY_ID;

    private LocalDateTime CREATED_DATETIME;

    private LocalDateTime MODIFIED_DATETIME;
}
