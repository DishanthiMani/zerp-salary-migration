package com.zirius.zerp.model.zerpapp;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "altinn_salary_run")
public class AltinnSalaryRun {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer SALARY_RUN_ID;

    private Integer SALARY_RUN_LOG_ID;

    private Integer REF_SALARY_RUN_ID;

    private Integer CREATED_BY;

    private Integer COMPANY_ID;

    private Integer REPORTEE;

    private String EXTERNAL_SHIPMENT_REFERENCE;

    private Integer SERVICE_CODE;

    private Integer SERVICE_EDITION;

    private Integer IS_COMPLETED;

    private Integer DATA_FORMAT_ID;

    private Integer DATA_FORMAT_VERSION;

    private String END_USER_SYSTEM_REFERENCE;

    private String PARENT_REFERENCE;

    private String A_MESSAGE_ID;

    private String REPLACE_A_MESSAGE_ID;

    private String CALENDER_MONTH;

    private String FORM_DATA;

    private Integer RECEIPT_ID;

    private Integer STATUS;

    private Integer STAGES;

    private Integer VERSION;

    private Date CREATED_DATETIME;

    private Date MODIFIED_DATETIME;
}
