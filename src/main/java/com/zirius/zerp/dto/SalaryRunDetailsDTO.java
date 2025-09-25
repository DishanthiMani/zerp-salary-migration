package com.zirius.zerp.dto;

import com.zirius.zerp.model.zerpapp.AltinnFeedback;
import com.zirius.zerp.model.zerpapp.AltinnFeedbackInfo;
import com.zirius.zerp.model.zerpapp.AltinnReferenceInfo;
import com.zirius.zerp.model.zerpapp.AltinnSalaryReport;
import com.zirius.zerp.model.zerpapp.AltinnSalaryRun;
import com.zirius.zerp.model.zerpapp.AltinnSalaryRunLineItem;
import com.zirius.zerp.model.zerpapp.AltinnSalaryRunPermission;
import com.zirius.zerp.model.zerpapp.AltinnSalaryRunWorkRelationship;
import com.zirius.zerp.model.zerpapp.BimonthlyReportDetails;
import com.zirius.zerp.model.zerpapp.ClaimDetailsLog;
import com.zirius.zerp.model.zerpapp.CompanyTaxLog;
import com.zirius.zerp.model.zerpapp.HolidayPayListLineItemLog;
import com.zirius.zerp.model.zerpapp.HolidayPayListLog;
import com.zirius.zerp.model.zerpapp.LedgerAccountLineItemLog;
import com.zirius.zerp.model.zerpapp.LedgerAccountLog;
import com.zirius.zerp.model.zerpapp.LedgerAccountSalaryReportingCodeLineItemLog;
import com.zirius.zerp.model.zerpapp.PaySlipLineItemLog;
import com.zirius.zerp.model.zerpapp.PaySlipLog;
import com.zirius.zerp.model.zerpapp.PaySlipPermissionLog;
import com.zirius.zerp.model.zerpapp.SalaryReportLog;
import com.zirius.zerp.model.zerpapp.SalaryRunLog;
import lombok.Data;

import java.util.List;

@Data
public class SalaryRunDetailsDTO {

    private SalaryRunLog salaryRunLogs;
    private AltinnSalaryRun altinnSalaryRuns;
    private List<AltinnSalaryRunLineItem> altinnSalaryRunLineItems;
    private List<AltinnSalaryRunPermission> altinnSalaryRunPermissions;
    private List<AltinnSalaryRunWorkRelationship> altinnSalaryRunWorkRelationships;
    private List<PaySlipLog> paySlipLogs;
    private List<PaySlipLineItemLog> paySlipLineItemLogs;
    private List<ClaimDetailsLog> claimDetailsLogs;
    private List<CompanyTaxLog> companyTaxLogs;
//    private List<HolidayPayListLog> holidayPayListLogs;
//    private List<HolidayPayListLineItemLog> holidayPayListLineItemLogs;
    private List<PaySlipPermissionLog> paySlipPermissionLogs;
    private LedgerAccountLog ledgerAccountLogs;
    private List<LedgerAccountLineItemLog> ledgerAccountLineItemLogs;
    private List<LedgerAccountSalaryReportingCodeLineItemLog> ledgerAccountSalaryReportingCodeLineItemLogs;
    private List<AltinnFeedback> altinnFeedbacks;
    private List<AltinnFeedbackInfo> altinnFeedbackInfos;
    private List<AltinnReferenceInfo> altinnReferenceInfos;
    private BankPaymentDetailsDTO bankPaymentDetailsDTO;

}
