package com.zirius.zerp.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "altinn_salary_taxinfo")
public class AltinnSalaryTaxInfo {

    @Id
    private Integer SALARY_TAXINFO_ID;
    private Integer SALARY_TAXINFO_LOG_ID;
    @Column(name = "CREATED_BY")
    private Integer user_id;
    private Integer COMPANY_ID;
    private Integer REPORTEE;
    private String EXTERNAL_SHIPMENT_REFERENCE;
    private Integer SERVICE_CODE;
    private Integer SERVICE_EDITION;
    private Boolean IS_COMPLETED;
    private Integer DATA_FORMAT_ID;
    private Integer DATA_FORMAT_VERSION;
    private String END_USER_SYSTEM_REFERENCE;
    private String PARENT_REFERENCE;
    private Date CREATED_TIME;
    private String FORM_DATA;
    private Integer RECEIPT_ID;
    private Integer STATUS;
    private Integer STAGES;
    private Integer VERSION;
    private Date CREATED_DATETIME;
    private Date MODIFIED_DATETIME;

}

