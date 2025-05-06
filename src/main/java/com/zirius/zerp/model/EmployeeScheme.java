package com.zirius.zerp.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "employee_scheme")
public class EmployeeScheme {

    @Id
    private Integer USER_COMPANY_ID;
    private Integer WORK_RELATIONSHIP_TYPE;
    private Integer EMPLOYMENT_TYPE_ID;
    private String SHIP_REGISTER;
    private String VESSEL_TYPE;
    private String SHIPPING_AREA;
    private Integer OCCUPATION_CODE;
    private String POSITION_DESIGNATION;
    private Integer REMUNERATION_TYPE;
    private Integer WORK_TIME_SCHEME;
    private Double NUMBER_OF_HOURS_PER_WEEK;
    private String WORKER_ID;
    private Date LAST_SALARY_CHANGE;
    private Date LAST_CHANGED_POSITION_PERCENT;
    private Integer VERSION;
    private Date CREATED_DATETIME;
    private Date MODIFIED_DATETIME;
}

