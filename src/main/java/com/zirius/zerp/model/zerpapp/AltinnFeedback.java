package com.zirius.zerp.model.zerpapp;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "altinn_feedback")
public class AltinnFeedback {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ALTINN_FEEDBACK_ID;

    private Integer SALARY_RUN_ID;

    private String BUSINESS_NUMBER;

    private String ssn;

    private String TYPE_OF_EMPLOYEE;

    private String ERROR_ID;

    private String ERROR_MESSAGE;

    private String ERROR_DETAILS;

    private String SEVERITY;

    private Date CREATED_DATETIME;

    private String EMPLOYEE_NAME;
}
