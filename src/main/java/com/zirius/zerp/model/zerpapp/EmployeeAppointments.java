package com.zirius.zerp.model.zerpapp;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "employee_appointments")
public class EmployeeAppointments {

    @Id
    private Integer USER_COMPANY_ID;
    private String EMPLOYEE_NUMBER;
    private Integer STATUS_ID;
    private Date STARTING_DATE;
    private Date ENDING_DATE;
    private Integer EMPLOYEE_END_REASON_ID;
    private Date CONFIRMATION_DATE;
    private Double HOURS_PER_DAY;
    private Integer NEAREST_BOSS_ID;
    private Integer VERSION;
    private Date CREATED_DATETIME;
    private Date MODIFIED_DATETIME;

}

