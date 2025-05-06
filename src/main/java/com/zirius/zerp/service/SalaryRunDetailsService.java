package com.zirius.zerp.service;

import com.zirius.zerp.dto.BankPaymentDetailsDTO;
import com.zirius.zerp.dto.SalaryRunDetailsDTO;
import com.zirius.zerp.repository.AltinnCommunicationDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SalaryRunDetailsService {

    @Autowired
    private AltinnCommunicationDetailsRepository repository;

    public SalaryRunDetailsDTO getSalaryRunDetailsAndLog(Integer companyId) {

        SalaryRunDetailsDTO salaryRunDetailsDTOS = new SalaryRunDetailsDTO();
        salaryRunDetailsDTOS.setSalaryRunLogs(repository.getSalaryRunLogList(companyId));
        salaryRunDetailsDTOS.setAltinnSalaryRuns(repository.getAltinnSalaryRunList(companyId));
        salaryRunDetailsDTOS.setAltinnSalaryRunLineItems(repository.getAltinnSalaryRunLineItems(companyId));
        salaryRunDetailsDTOS.setAltinnSalaryRunPermissions(repository.getAltinnSalaryRunPermission(companyId));
        salaryRunDetailsDTOS.setAltinnSalaryRunWorkRelationships(repository.getAltinnSalaryRunWorkRelationShip(companyId));
        salaryRunDetailsDTOS.setAltinnSalaryReports(repository.getAltinnSalaryReportLog(companyId));
        salaryRunDetailsDTOS.setPaySlipLogs(repository.getPaySlipLog(companyId));
        salaryRunDetailsDTOS.setPaySlipLineItemLogs(repository.getPaySlipLineItemLog(companyId));
        salaryRunDetailsDTOS.setClaimDetailsLogs(repository.getClaimDetailsLog(companyId));
        salaryRunDetailsDTOS.setCompanyTaxLogs(repository.getComanyTaxLogList(companyId));
        salaryRunDetailsDTOS.setHolidayPayListLogs(repository.getHolidayPayListLog(companyId));
        salaryRunDetailsDTOS.setHolidayPayListLineItemLogs(repository.getHolidayPaySlipLineItemLog(companyId));
        salaryRunDetailsDTOS.setPaySlipPermissionLogs(repository.getPaySlipPermissionLog(companyId));
        salaryRunDetailsDTOS.setLedgerAccountLogs(repository.getLedgerAccountLog(companyId));
        salaryRunDetailsDTOS.setLedgerAccountLineItemLogs(repository.getLedgerAccountLineItemLog(companyId));
        salaryRunDetailsDTOS.setLedgerAccountSalaryReportingCodeLineItemLogs(repository.getLedgerAccountSalaryCodeLog(companyId));
        salaryRunDetailsDTOS.setAltinnFeedbacks(repository.getAltinnFeedBack(companyId));
        salaryRunDetailsDTOS.setAltinnFeedbackInfos(repository.getAltinnFeedbackInfo(companyId));
        salaryRunDetailsDTOS.setAltinnReferenceInfos(repository.getAltinnReferenceInfo(companyId));

        BankPaymentDetailsDTO bankPaymentDetailsDTO = new BankPaymentDetailsDTO();
        bankPaymentDetailsDTO.setBankListLogs(repository.getBankListLog(companyId));
        bankPaymentDetailsDTO.setBankListLineItemLogs(repository.getBankListLineItemLog(companyId));
        salaryRunDetailsDTOS.setBankPaymentDetailsDTO(bankPaymentDetailsDTO);

        return salaryRunDetailsDTOS;
    }
}
