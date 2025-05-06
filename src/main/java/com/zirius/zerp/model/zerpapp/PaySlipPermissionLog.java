package com.zirius.zerp.model.zerpapp;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "pay_slip_permission_log")
public class PaySlipPermissionLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer PAY_SLIP_PERMISSION_LOG_ID;

    private Integer PAY_SLIP_LOG_ID;

    private Integer USER_COMPANY_ID;

    private String PERMISSION_ID;

    private Integer PERCENTAGE;

    private String DESCRIPTION_ID;

    private LocalDateTime START_DATE;

    private LocalDateTime END_DATE;

    private Integer COMPANY_ID;

    private LocalDateTime CREATED_DATETIME;

    private LocalDateTime MODIFIED_DATETIME;
}
