package com.zirius.zerp.model.zerpapp;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "employee_worker_id_details")
public class EmployeeWorkerIdDetails {

    @Id
    private Integer EMPLOYEE_WORKER_ID_DETAILS_ID;
    private Integer USER_COMPANY_ID;
    private String WORKER_ID;
    private Date CREATED_DATETIME;

}


