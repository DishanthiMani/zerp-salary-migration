package com.zirius.zerp.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "holiday_pay_list_log")
public class HolidayPayListLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer HOLIDAY_PAY_LIST_LOG_ID;

    private Integer YEAR;

    private String FROM_MONTH;

    private String TO_MONTH;

    private String TOTAL_ORDINARY_HOLIDAY_PAY_AMOUNT;

    private String TOTAL_OVER_60_HOLIDAY_PAY_AMOUNT;

    private String TOTAL_BASIS_AMOUNT;

    private String TOTAL_HOLIDAY_PAY_SUM;

    private Integer COMPANY_ID;

    private Integer TOTAL_EMPLOYEES_COUNT;

    private LocalDateTime CREATED_DATETIME;
}
