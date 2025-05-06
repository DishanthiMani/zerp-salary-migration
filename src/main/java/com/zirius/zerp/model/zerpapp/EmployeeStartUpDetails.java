package com.zirius.zerp.model.zerpapp;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
@Table(name = "employee_startup_details")
public class EmployeeStartUpDetails {

    @Id
    private Integer EMPLOYEE_STARTUP_DETAILS_ID;
    private Integer USER_COMPANY_ID;
    private BigDecimal TOTAL_SALARY;
    private BigDecimal TOTAL_PERSON_TAX;
    private Integer PERSON_TAX_YEAR;
    private BigDecimal TOTAL_COMPANY_TAX;
    private BigDecimal TOTAL_HOLIDAY_PAY;
    private Integer HOLIDAY_PAY_YEAR;
    private BigDecimal AVAILABLE_HOLIDAYS;
    private BigDecimal BASIS_PERSON;
    private BigDecimal BASIS_COMPANY;
    private BigDecimal BASIS_HOLIDAY_PAY;
    private BigDecimal BASIS_HOLIDAY_PAY_TAX;
    private BigDecimal DEVIANT_HOLIDAY_PAY_BALANCE;
    private BigDecimal DEVIANT_HOLIDAY_PERCENT;
    private BigDecimal BASIS_HOLIDAY_PAY_OVER_60;
    private BigDecimal BASIS_HOLIDAY_PAY_OVER_60_TAX;
    private BigDecimal REMAINING_HOLIDAY_PAY_AMOUNT;
    private Integer VERSION;
    private Date MODIFIED_DATETIME;
    private Date CREATED_DATETIME;
    private Boolean  IS_ACTIVE;

}
