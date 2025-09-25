package com.zirius.zerp.service;

import com.zirius.zerp.dto.BankPaymentDetailsDTO;
import com.zirius.zerp.dto.SalaryRunDetailsDTO;
import com.zirius.zerp.model.zerpapp.AltinnFeedback;
import com.zirius.zerp.model.zerpapp.AltinnFeedbackInfo;
import com.zirius.zerp.model.zerpapp.AltinnReferenceInfo;
import com.zirius.zerp.model.zerpapp.AltinnSalaryReport;
import com.zirius.zerp.model.zerpapp.AltinnSalaryRun;
import com.zirius.zerp.model.zerpapp.AltinnSalaryRunLineItem;
import com.zirius.zerp.model.zerpapp.AltinnSalaryRunPermission;
import com.zirius.zerp.model.zerpapp.AltinnSalaryRunWorkRelationship;
import com.zirius.zerp.model.zerpapp.BankListLineItemLog;
import com.zirius.zerp.model.zerpapp.BankListLog;
import com.zirius.zerp.model.zerpapp.ClaimDetailsLog;
import com.zirius.zerp.model.zerpapp.CompanyTaxLog;
import com.zirius.zerp.model.zerpapp.LedgerAccountLineItemLog;
import com.zirius.zerp.model.zerpapp.LedgerAccountLog;
import com.zirius.zerp.model.zerpapp.LedgerAccountSalaryReportingCodeLineItemLog;
import com.zirius.zerp.model.zerpapp.PaySlipLineItemLog;
import com.zirius.zerp.model.zerpapp.PaySlipLog;
import com.zirius.zerp.model.zerpapp.PaySlipPermissionLog;
import com.zirius.zerp.model.zerpapp.SalaryRunLog;
import com.zirius.zerp.repository.zerpRepo.AltinnCommunicationDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@Service
public class SalaryRunDetailsService {

    @Autowired
    private AltinnCommunicationDetailsRepository repository;

    public List<SalaryRunDetailsDTO> getSalaryRunDetailsAndLog(Integer companyId) {

        List<SalaryRunDetailsDTO> runDetailsDTOList = new ArrayList<>();

        Map<Integer, SalaryRunLog> salaryRunLogs = repository.getSalaryRunLogList(companyId);
        Map<Integer, AltinnSalaryRun> altinnSalaryRuns = repository.getAltinnSalaryRunList(companyId, salaryRunLogs.keySet());
        List<Integer> altinnRunIds = altinnSalaryRuns.values().stream().map(AltinnSalaryRun::getSALARY_RUN_ID).toList();
        Map<Integer, List<AltinnSalaryRunLineItem>> altinnLineItems = repository.getAltinnSalaryRunLineItems(altinnRunIds, companyId);
        Map<Integer, List<AltinnSalaryRunPermission>> altinnPermissionItems = repository.getAltinnSalaryRunPermission(altinnRunIds, companyId);
        Map<Integer, List<AltinnSalaryRunWorkRelationship>> altinnWRItems = repository.getAltinnSalaryRunWorkRelationShip(altinnRunIds, companyId);
        Map<Integer, List<PaySlipLog>> paySlipLogMap = repository.getPaySlipLog(salaryRunLogs.keySet(),companyId);
        List<PaySlipLog> allPaySlipLogs = paySlipLogMap.values().stream()
                .flatMap(List::stream)
                .toList();

        Map<Integer, List<PaySlipLineItemLog>> paySlipLineItemList = repository.getPaySlipLineItemLog(allPaySlipLogs, companyId, salaryRunLogs.keySet());
        Map<Integer, List<ClaimDetailsLog>> claimDetailsList = repository.getClaimDetailsLog(salaryRunLogs.keySet(),companyId);
        Map<Integer, List<CompanyTaxLog>> companyTaxLogList = repository.getComanyTaxLogList(salaryRunLogs.keySet(), companyId);
        Map<Integer, List<PaySlipPermissionLog>> paySlipPermissionList = repository.getPaySlipPermissionLog(allPaySlipLogs, companyId, salaryRunLogs.keySet());
        Map<Integer, LedgerAccountLog> ledgerAccountLogMap = repository.getLedgerAccountLog(salaryRunLogs.keySet());
        Map<Integer, List<LedgerAccountLineItemLog>> ledger_account_log = repository.getLedgerAccountLineItemLog(salaryRunLogs.keySet());
        Map<Integer, List<LedgerAccountSalaryReportingCodeLineItemLog>> ledgerSrcLog = repository.getLedgerAccountSalaryCodeLog(salaryRunLogs.keySet());
        Map<Integer, List<AltinnFeedback>> altinnFeedbackList = repository.getAltinnFeedBack(altinnRunIds);
        Map<Integer, List<AltinnFeedbackInfo>> altinnFeedBackInfoList = repository.getAltinnFeedbackInfo(altinnRunIds);
        Map<Integer, List<AltinnReferenceInfo>> altinnRefInfo = repository.getAltinnReferenceInfo(altinnRunIds);
        Map<Integer, List<BankListLog>> bankListLog = repository.getBankListLog(salaryRunLogs.keySet());

        List<BankListLog> allBankListLogs = bankListLog.values().stream()
                .flatMap(List::stream)
                .toList();

        Map<Integer, List<BankListLineItemLog>> bankListLineItemLogMap =
                repository.getBankListLineItemLog(salaryRunLogs.keySet(), allBankListLogs, companyId);




        for (SalaryRunLog srl : salaryRunLogs.values()) {

            SalaryRunDetailsDTO salaryRunDetailsDTOS = new SalaryRunDetailsDTO();

            salaryRunDetailsDTOS.setSalaryRunLogs(srl);
            AltinnSalaryRun altinnSalaryRun = altinnSalaryRuns.get(srl.getSALARY_RUN_LOG_ID());
            salaryRunDetailsDTOS.setAltinnSalaryRuns(altinnSalaryRun);

            if (altinnSalaryRun != null) {
                Integer salaryRunId = altinnSalaryRun.getSALARY_RUN_ID();

                salaryRunDetailsDTOS.setAltinnSalaryRunLineItems(
                        altinnLineItems.getOrDefault(salaryRunId, null)
                );
                salaryRunDetailsDTOS.setAltinnSalaryRunPermissions(
                        altinnPermissionItems.getOrDefault(salaryRunId, null)
                );
                salaryRunDetailsDTOS.setAltinnSalaryRunWorkRelationships(
                        altinnWRItems.getOrDefault(salaryRunId, null)
                );
                salaryRunDetailsDTOS.setAltinnFeedbacks(
                        altinnFeedbackList.getOrDefault(salaryRunId, null)
                );
                salaryRunDetailsDTOS.setAltinnFeedbackInfos(
                        altinnFeedBackInfoList.getOrDefault(salaryRunId, null)
                );
                salaryRunDetailsDTOS.setAltinnReferenceInfos(
                        altinnRefInfo.getOrDefault(salaryRunId, null)
                );
            } else {
                salaryRunDetailsDTOS.setAltinnSalaryRunLineItems(null);
                salaryRunDetailsDTOS.setAltinnSalaryRunPermissions(null);
                salaryRunDetailsDTOS.setAltinnSalaryRunWorkRelationships(null);
                salaryRunDetailsDTOS.setAltinnFeedbacks(null);
                salaryRunDetailsDTOS.setAltinnFeedbackInfos(null);
                salaryRunDetailsDTOS.setAltinnReferenceInfos(null);
            }

            salaryRunDetailsDTOS.setPaySlipLogs(paySlipLogMap.getOrDefault(srl.getSALARY_RUN_LOG_ID(), null));
            salaryRunDetailsDTOS.setPaySlipLineItemLogs(paySlipLineItemList.getOrDefault(srl.getSALARY_RUN_LOG_ID(), null));
            salaryRunDetailsDTOS.setClaimDetailsLogs(claimDetailsList.getOrDefault(srl.getSALARY_RUN_LOG_ID(), null));
            salaryRunDetailsDTOS.setCompanyTaxLogs(companyTaxLogList.getOrDefault(srl.getSALARY_RUN_LOG_ID(), null));
            salaryRunDetailsDTOS.setPaySlipPermissionLogs(paySlipPermissionList.getOrDefault(srl.getSALARY_RUN_LOG_ID(), null));
            salaryRunDetailsDTOS.setLedgerAccountLogs(ledgerAccountLogMap.getOrDefault(srl.getSALARY_RUN_LOG_ID(), null));
            salaryRunDetailsDTOS.setLedgerAccountLineItemLogs(ledger_account_log.getOrDefault(srl.getSALARY_RUN_LOG_ID(), null));
            salaryRunDetailsDTOS.setLedgerAccountSalaryReportingCodeLineItemLogs(ledgerSrcLog.getOrDefault(srl.getSALARY_RUN_LOG_ID(), null));

            BankPaymentDetailsDTO bankPaymentDetailsDTO = new BankPaymentDetailsDTO();
            bankPaymentDetailsDTO.setBankListLogs(bankListLog.getOrDefault(srl.getSALARY_RUN_LOG_ID(), null));
            bankPaymentDetailsDTO.setBankListLineItemLogs(bankListLineItemLogMap.getOrDefault(srl.getSALARY_RUN_LOG_ID(), null));

            salaryRunDetailsDTOS.setBankPaymentDetailsDTO(bankPaymentDetailsDTO);
            runDetailsDTOList.add(salaryRunDetailsDTOS);
        }

        return runDetailsDTOList;
    }
}
