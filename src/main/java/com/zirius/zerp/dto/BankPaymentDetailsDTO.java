package com.zirius.zerp.dto;

import com.zirius.zerp.model.BankListLineItemLog;
import com.zirius.zerp.model.BankListLog;
import com.zirius.zerp.model.SalaryPaymentRequestDetails;
import lombok.Data;

import java.util.List;

@Data
public class BankPaymentDetailsDTO {

    private List<BankListLog> bankListLogs;
    private List<BankListLineItemLog> bankListLineItemLogs;
    private List<SalaryPaymentRequestDetails> salaryPaymentRequestDetails;
}
