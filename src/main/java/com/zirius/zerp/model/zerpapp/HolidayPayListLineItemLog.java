package com.zirius.zerp.model.zerpapp;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "holiday_pay_list_line_item_log")
public class HolidayPayListLineItemLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer HOLIDAY_PAY_LIST_LINE_ITEM_LOG_ID;

    private Integer HOLIDAY_PAY_LIST_LOG_ID;

    private Integer USER_ID;

    private Integer USER_COMPANY_ID;

    private String USER_NAME;

    private String BASIS_AMOUNT;

    private String ORIDARY_HOLIDAY_PAY_AMOUNT;

    private String OVER_60_HOLIDAY_PAY_AMOUNT;

    private String TOTAL_HOLIDAY_PAY_AMOUNT;
}
