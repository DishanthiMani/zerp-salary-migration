package com.zirius.zerp.model.zerpapp;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "altinn_salary_run_permission")
public class AltinnSalaryRunPermission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ALTINN_SALARY_RUN_PERMISSION_ID;

    private Integer ALTINN_SALARY_RUN_ID;

    private Integer ALTINN_SALARY_RUN_WORK_RELATIONSHIP_ID;

    private Integer USER_COMPANY_ID;

    private Integer WORK_PLACE_ID;

    private String PERCENTAGE;

    private Date START_DATE;

    private Date END_DATE;

    private String PERMISSION_ID;

    private String DESCRIPTION;

    private Integer VERSION;

    private Date CREATED_DATETIME;

    private Date MODIFIED_DATETIME;
}
