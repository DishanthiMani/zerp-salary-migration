package com.zirius.zerp.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "altinn_salary_report")
public class AltinnSalaryReport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer SALARY_REPORT_ID;

    private Integer SALARY_REPORT_LOG_ID;

    private Integer CREATED_BY;

    private Integer COMPANY_ID;

    private Integer REPORTEE;

    private String EXTERNAL_SHIPMENT_REFERENCE;

    private Integer SERVICE_CODE;

    private Integer SERVICE_EDITION;

    private Integer DATA_FORMAT_ID;

    private Integer DATA_FORMAT_VERSION;

    private String END_USER_SYSTEM_REFERENCE;

    private String PARENT_REFERENCE;

    private Integer IS_COMPLETED;

    private Date CREATED_TIME;

    private String FORM_DATA;

    private Integer RECEIPT_ID;

    private Integer STATUS;

    private Integer STAGES;

    private Integer VERSION;

    private Date CREATED_DATETIME;

    private Date MODIFIED_DATETIME;

    private Integer IS_DELETED;
}
