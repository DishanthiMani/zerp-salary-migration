package com.zirius.zerp.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "salary_taxinfo_log")
public class SalaryTaxInfoLog {

    @Id
    private Integer SALARY_TAXINFO_LOG_ID;
    @Column(name = "CREATED_BY")
    private Integer user_id;
    private Integer REPORTED_YEAR;
    private String REPORT_TYPE;
    private Date FETCH_TAX_CARD_FOR_DATE;
    private String PHONE;
    private String EMAIL;
    private String ORG_NO;
    private Integer COMPANY_ID;
    private Integer VERSION;
    private Date CREATED_DATETIME;
    private Date MODIFIED_DATETIME;

}
