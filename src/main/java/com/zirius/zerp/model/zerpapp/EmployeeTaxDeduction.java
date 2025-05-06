package com.zirius.zerp.model.zerpapp;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
@Table(name = "employee_tax_deduction")
public class EmployeeTaxDeduction {

    @Id
    private Integer USER_COMPANY_ID;
    private String ssn;
    private String international_id;
    private Boolean  is_foreign_earning_country;
    private String foreign_country_code;
    private Boolean  is_continental_shelf;
    private Boolean  is_border_worker;
    private String border_worker_country_code;
    private Integer EMPLOYEE_NUMBER_TYPE_ID;
    private Date DATE_OF_BIRTH;
    private Integer MUNICIPALITY_ID;
    private Integer FOREIGNER_ID;
    private Integer TABLE_TYPE_ID;
    private Integer TABLE_NUMBER;
    private BigDecimal PERCENTAGE_DRAW_ID;
    private Boolean  IS_MORE_THAN_ONE_EMPLOYER;
    private Boolean  IS_PENSIONER;
    private BigDecimal FREE_CARD_AMOUNT;
    private BigDecimal FREE_CARD_BALANCE;
    private Integer NUMBER_OF_WEEKS;
    private Integer SAILORS_ID;
    private Integer TAX_RULE_ID;
    private Integer VERSION;
    private Date TAX_CARD_DATE;
    private Date CREATED_DATETIME;
    private Date MODIFIED_DATETIME;

}

