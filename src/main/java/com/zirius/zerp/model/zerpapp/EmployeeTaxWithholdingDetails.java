package com.zirius.zerp.model.zerpapp;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity
@Table(name = "salary_employee_tax_withholding_details")
public class EmployeeTaxWithholdingDetails {

    @Id
    private Integer SALARY_EMPLOYEE_TAX_WITHHOLDING_DETAILS_ID;
    private Integer SALARY_EMPLOYEE_TAX_DETAILS_ID;
    private Integer SALARY_ALTINN_TAX_CODE_ID;
    private Integer TABLE_TYPE_ID;
    private String TABLE_NUMBER;
    private BigDecimal NO_OF_MONTHS_FOR_DRAWING;
    private BigDecimal TAX_CARD_EXEMPTION_AMOUNT;
    private BigDecimal PERCENTAGE;

}

