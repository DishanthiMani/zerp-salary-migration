package com.zirius.zerp.dto;

import com.zirius.zerp.model.zerpapp.BankListLineItemLog;
import com.zirius.zerp.model.zerpapp.BankListLog;
import com.zirius.zerp.model.zerpapp.SalaryPaymentRequestDetails;
import lombok.Data;

import java.util.List;

@Data
public class BankPaymentDetailsDTO {

    private List<BankListLog> bankListLogs;
    private List<BankListLineItemLog> bankListLineItemLogs;
    private List<SalaryPaymentRequestDetails> salaryPaymentRequestDetails;
}
