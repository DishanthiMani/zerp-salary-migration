package com.zirius.zerp.model.zerpapp;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "claim_details_log")
public class ClaimDetailsLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer CLAIM_DETAILS_LOG_ID;

    private Integer SALARY_RUN_LOG_ID;

    private String ACCOUNT_NO;

    private String UNION_NAME;

    private String AMOUNT;

    private Integer CLAIM_COLLECTORS_ID;
}
