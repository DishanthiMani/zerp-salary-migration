package com.zirius.zerp.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "salary_employee_taxdetails")
public class SalaryEmployeeTaxDetails {

    @Id
    private Integer SALARY_EMPLOYEE_TAXDETAILS_ID;
    private Integer SALARY_TAXINFO_ID;
    private String user_ssn;
    private String ORG_NO;
    private String MUNICIPALITY;
    private String TABLE_NO;
    private String TABLE_TYPE;
    private String PERCENTAGE;
    private String ADVANCE_FORM;
    private String EMPLOYEE_GROUP;
    private String SIGNAL_FLAG;
    private String OLD_START_DATE;
    private Date START_DATE;
    private String EXCEPTION_CARD_AMOUNTS;
    private String TABLE_CARD_FLAG;
    private String TAX_CARD_ID;
    private Integer INCOME_YEAR;
    private String ADDITIONAL_INFO;

}
