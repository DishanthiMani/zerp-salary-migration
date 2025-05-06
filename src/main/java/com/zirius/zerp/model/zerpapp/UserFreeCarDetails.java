package com.zirius.zerp.model.zerpapp;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "user_company_free_car_details")
public class UserFreeCarDetails {

    @Id
    private Integer USER_COMPANY_FREE_CAR_DETAILS_ID;
    private Integer COMPANY_FREE_CAR_DETAILS_ID;
    private Integer USER_COMPANY_ID;
    private Integer EMPLOYEE_STARTUP_DETAILS_ID;
    private Integer DEPARTMENT_ID;
    private Integer ACTIVITY_ID;
    private Integer PROJECT_ID;
    private Integer DIMENSION1_ID;
    private Integer WORK_PLACE_ID;
    private Integer STATUS;
    private String REFERENCE_YEAR;
    private Date START_DATE;
    private Date END_DATE;
    private Integer VERSION;
    private Date CREATED_DATETIME;
    private Date MODIFIED_DATETIME;

}

