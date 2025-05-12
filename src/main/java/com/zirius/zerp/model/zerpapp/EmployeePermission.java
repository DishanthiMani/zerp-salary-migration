package com.zirius.zerp.model.zerpapp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "employee_permission")
public class EmployeePermission {

    @Id
    private Integer EMPLOYEE_PERMISSION_ID;
    private Integer USER_COMPANY_ID;
    private String PERMISSION_ID;
    private Integer PERCENTAGE;
    private String DESCRIPTION_ID;
    private Date START_DATE;
    private Date END_DATE;
    private Integer COMPANY_ID;
    private Integer WORK_PLACE_ID;
    private Integer VERSION;
    private Boolean IS_ACTIVE;
    private Date CREATED_DATETIME;
    private Date MODIFIED_DATETIME;
}
