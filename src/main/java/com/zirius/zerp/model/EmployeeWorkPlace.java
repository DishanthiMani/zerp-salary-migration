package com.zirius.zerp.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "employee_work_place")
public class EmployeeWorkPlace {

    @Id
    private Integer EMPLOYEE_WORK_PLACE_ID;
    private Integer USER_COMPANY_ID;
    private Integer WORK_PLACE_ID;
    private String WORK_PLACE_NO;
    private String WORK_PLACE_NAME;
    private Integer WORK_PERCENTAGE;
    private Date FROM_DATE;
    private Date TO_DATE;
    private Integer VERSION;
    private Date CREATED_DATETIME;
    private Date MODIFIED_DATETIME;
}
