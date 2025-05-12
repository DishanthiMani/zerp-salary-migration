package com.zirius.zerp.model.zerpapp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "salary_report_log")
public class SalaryReportLog {

    @Id
    private Integer SALARY_REPORT_LOG_ID;
    private Integer CREATED_BY;
    private Integer REPORTED_YEAR;
    private Integer FROM_MONTH;
    private Integer TO_MONTH;
    private String REPORT_TYPE;
    private Boolean IS_COMPLETED;
    private Boolean IS_BIMONTHLY;
    private Date CREATED_TIME;
    private String ORG_NO;
    private Integer COMPANY_ID;
    private Integer VERSION;
    private Date CREATED_DATETIME;
    private Date MODIFIED_DATETIME;
}
