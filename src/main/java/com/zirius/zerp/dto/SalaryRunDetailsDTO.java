package com.zirius.zerp.dto;

import com.zirius.zerp.model.AltinnFeedback;
import com.zirius.zerp.model.AltinnFeedbackInfo;
import com.zirius.zerp.model.AltinnReferenceInfo;
import com.zirius.zerp.model.AltinnSalaryReport;
import com.zirius.zerp.model.AltinnSalaryRun;
import com.zirius.zerp.model.AltinnSalaryRunLineItem;
import com.zirius.zerp.model.AltinnSalaryRunPermission;
import com.zirius.zerp.model.AltinnSalaryRunWorkRelationship;
import com.zirius.zerp.model.ClaimDetailsLog;
import com.zirius.zerp.model.CompanyTaxLog;
import com.zirius.zerp.model.HolidayPayListLineItemLog;
import com.zirius.zerp.model.HolidayPayListLog;
import com.zirius.zerp.model.LedgerAccountLineItemLog;
import com.zirius.zerp.model.LedgerAccountLog;
import com.zirius.zerp.model.LedgerAccountSalaryReportingCodeLineItemLog;
import com.zirius.zerp.model.PaySlipLineItemLog;
import com.zirius.zerp.model.PaySlipLog;
import com.zirius.zerp.model.PaySlipPermissionLog;
import com.zirius.zerp.model.SalaryRunLog;
import lombok.Data;

import java.util.List;

@Data
public class SalaryRunDetailsDTO {

    private List<SalaryRunLog> salaryRunLogs;
    private List<AltinnSalaryRun> altinnSalaryRuns;
    private List<AltinnSalaryRunLineItem> altinnSalaryRunLineItems;
    private List<AltinnSalaryRunPermission> altinnSalaryRunPermissions;
    private List<AltinnSalaryRunWorkRelationship> altinnSalaryRunWorkRelationships;
    private List<AltinnSalaryReport> altinnSalaryReports;
    private List<PaySlipLog> paySlipLogs;
    private List<PaySlipLineItemLog> paySlipLineItemLogs;
    private List<ClaimDetailsLog> claimDetailsLogs;
    private List<CompanyTaxLog> companyTaxLogs;
    private List<HolidayPayListLog> holidayPayListLogs;
    private List<HolidayPayListLineItemLog> holidayPayListLineItemLogs;
    private List<PaySlipPermissionLog> paySlipPermissionLogs;
    private List<LedgerAccountLog> ledgerAccountLogs;
    private List<LedgerAccountLineItemLog> ledgerAccountLineItemLogs;
    private List<LedgerAccountSalaryReportingCodeLineItemLog> ledgerAccountSalaryReportingCodeLineItemLogs;
    private List<AltinnFeedback> altinnFeedbacks;
    private List<AltinnFeedbackInfo> altinnFeedbackInfos;
    private List<AltinnReferenceInfo> altinnReferenceInfos;
    private BankPaymentDetailsDTO bankPaymentDetailsDTO;

}
