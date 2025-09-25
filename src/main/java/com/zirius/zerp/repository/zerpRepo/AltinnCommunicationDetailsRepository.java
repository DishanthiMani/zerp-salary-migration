package com.zirius.zerp.repository.zerpRepo;

import com.zirius.zerp.model.zerpapp.AltinnFeedback;
import com.zirius.zerp.model.zerpapp.AltinnFeedbackInfo;
import com.zirius.zerp.model.zerpapp.AltinnReferenceInfo;
import com.zirius.zerp.model.zerpapp.AltinnSalaryReport;
import com.zirius.zerp.model.zerpapp.AltinnSalaryRun;
import com.zirius.zerp.model.zerpapp.AltinnSalaryRunLineItem;
import com.zirius.zerp.model.zerpapp.AltinnSalaryRunPermission;
import com.zirius.zerp.model.zerpapp.AltinnSalaryRunWorkRelationship;
import com.zirius.zerp.model.zerpapp.AltinnSalaryTaxInfo;
import com.zirius.zerp.model.zerpapp.AltinnSalaryTaxInfoUsers;
import com.zirius.zerp.model.zerpapp.BankListLineItemLog;
import com.zirius.zerp.model.zerpapp.BankListLog;
import com.zirius.zerp.model.zerpapp.BimonthlyReportDetails;
import com.zirius.zerp.model.zerpapp.ClaimDetailsLog;
import com.zirius.zerp.model.zerpapp.CompanyTaxLog;
import com.zirius.zerp.model.zerpapp.EmployeeTaxWithholdingDetails;
import com.zirius.zerp.model.zerpapp.HolidayPayListLineItemLog;
import com.zirius.zerp.model.zerpapp.HolidayPayListLog;
import com.zirius.zerp.model.zerpapp.LedgerAccountLineItemLog;
import com.zirius.zerp.model.zerpapp.LedgerAccountLog;
import com.zirius.zerp.model.zerpapp.LedgerAccountSalaryReportingCodeLineItemLog;
import com.zirius.zerp.model.zerpapp.PaySlipLineItemLog;
import com.zirius.zerp.model.zerpapp.PaySlipLog;
import com.zirius.zerp.model.zerpapp.PaySlipPermissionLog;
import com.zirius.zerp.model.zerpapp.SalaryEmployeeTaxDetails;
import com.zirius.zerp.model.zerpapp.SalaryReportLog;
import com.zirius.zerp.model.zerpapp.SalaryRunLog;
import com.zirius.zerp.model.zerpapp.SalaryTaxInfoLog;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

@Repository
public class AltinnCommunicationDetailsRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<SalaryTaxInfoLog> getSalaryTaxInfoLog(Integer companyId) {
        return entityManager.createQuery("SELECT c FROM SalaryTaxInfoLog c WHERE c.COMPANY_ID = :companyId", SalaryTaxInfoLog.class)
                .setParameter("companyId", companyId).getResultList();
    }

    public List<AltinnSalaryTaxInfo> getAltinnSalaryTaxInfo(Integer companyId) {
        return entityManager.createQuery("SELECT c FROM AltinnSalaryTaxInfo c WHERE c.COMPANY_ID = :companyId", AltinnSalaryTaxInfo.class)
                .setParameter("companyId", companyId).getResultList();
    }

    public List<AltinnSalaryTaxInfoUsers> getAltinnSalaryTaxInfoUsers(Integer companyId) {
        return entityManager.createQuery("SELECT c FROM AltinnSalaryTaxInfoUsers c JOIN UserCompany u " +
                        "ON u.USER_COMPANY_ID = c.USER_COMPANY_ID WHERE u.COMPANY_ID = :companyId", AltinnSalaryTaxInfoUsers.class)
                .setParameter("companyId", companyId).getResultList();
    }
    public List<EmployeeTaxWithholdingDetails> getEmployeeWithholdingDetails(Integer companyId) {
        return entityManager.createQuery("SELECT c FROM EmployeeTaxWithholdingDetails c JOIN SalaryEmployeeTaxDetails s " +
                        "ON s.SALARY_EMPLOYEE_TAXDETAILS_ID = c.SALARY_EMPLOYEE_TAX_DETAILS_ID JOIN AltinnSalaryTaxInfo t " +
                        "ON t.SALARY_TAXINFO_ID = s.SALARY_TAXINFO_ID WHERE t.COMPANY_ID = :companyId", EmployeeTaxWithholdingDetails.class)
                .setParameter("companyId", companyId).getResultList();
    }

    public List<SalaryEmployeeTaxDetails> getSalaryEmployeeTaxDetails(Integer companyId) {
        return entityManager.createQuery("SELECT c FROM SalaryEmployeeTaxDetails c JOIN AltinnSalaryTaxInfo t ON " +
                        "t.SALARY_TAXINFO_ID = c.SALARY_TAXINFO_ID WHERE t.COMPANY_ID = :companyId", SalaryEmployeeTaxDetails.class)
                .setParameter("companyId", companyId).getResultList();
    }

    public Map<Integer, SalaryRunLog> getSalaryRunLogList(Integer companyId) {

        List<SalaryRunLog> list = entityManager.createNativeQuery(
                        "SELECT * " +
                                "FROM salary_run_log srl " +
                                "WHERE srl.SALARY_RUN_DATE BETWEEN " +
                                "      CAST(DATE_FORMAT(DATE_SUB(CURDATE(), INTERVAL 2 YEAR), '%Y01') AS UNSIGNED) " +
                                "  AND CAST(DATE_FORMAT(CURDATE(), '%Y%m') AS UNSIGNED) " +
                                "  AND srl.IS_DELETE = FALSE " +
                                "  AND srl.COMPANY_ID = :companyId",
                        SalaryRunLog.class
                )
                .setParameter("companyId", companyId)
                .getResultList();


        return list.stream()
                .collect(Collectors.toMap(
                        SalaryRunLog::getSALARY_RUN_LOG_ID,
                        Function.identity()
                ));
    }

    public Map<Integer, AltinnSalaryRun> getAltinnSalaryRunList(Integer companyId, Set<Integer> salaryRunLogIds) {
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT asr.* ")
                .append("FROM altinn_salary_run asr ")
                .append("LEFT JOIN salary_run_log srl ON srl.SALARY_RUN_LOG_ID = asr.SALARY_RUN_LOG_ID ")
                .append("WHERE srl.COMPANY_ID = :companyId ")
                .append("AND srl.SALARY_RUN_LOG_ID IN (:salaryRunLogIds)");

        List<AltinnSalaryRun> result = entityManager.createNativeQuery(
                        sql.toString(),
                        AltinnSalaryRun.class
                )
                .setParameter("companyId", companyId)
                .setParameter("salaryRunLogIds", salaryRunLogIds)
                .getResultList();

        return result.stream()
                .collect(Collectors.toMap(
                        AltinnSalaryRun::getSALARY_RUN_LOG_ID,
                        Function.identity()
                ));

    }

    public Map<Integer, List<AltinnSalaryRunLineItem>> getAltinnSalaryRunLineItems(
            List<Integer> altinnRunIds, Integer companyId) {

        List<AltinnSalaryRunLineItem> runItems = entityManager.createNativeQuery(
                        "SELECT asl.* FROM altinn_salary_run_line_item asl " +
                                "JOIN altinn_salary_run asr ON asr.SALARY_RUN_ID = asl.SALARY_RUN_ID " +
                                "WHERE asl.SALARY_RUN_ID IN (:altinnRunIds) " +
                                "AND asr.COMPANY_ID = :companyId",
                        AltinnSalaryRunLineItem.class
                )
                .setParameter("companyId", companyId)
                .setParameter("altinnRunIds", altinnRunIds)
                .getResultList();

        return runItems.stream()
                .collect(Collectors.groupingBy(AltinnSalaryRunLineItem::getSALARY_RUN_ID));
    }


    public Map<Integer, List<AltinnSalaryRunPermission>> getAltinnSalaryRunPermission(List<Integer> altinnRunIds, Integer companyId) {

        List<AltinnSalaryRunPermission> runItems = entityManager.createNativeQuery(
                        "SELECT asl.* FROM altinn_salary_run_permission asl " +
                                "JOIN altinn_salary_run asr ON asr.SALARY_RUN_ID = asl.ALTINN_SALARY_RUN_ID " +
                                "WHERE asl.ALTINN_SALARY_RUN_ID IN (:altinnRunIds) " +
                                "AND asr.COMPANY_ID = :companyId",
                        AltinnSalaryRunPermission.class
                )
                .setParameter("companyId", companyId)
                .setParameter("altinnRunIds", altinnRunIds)
                .getResultList();

        return runItems.stream()
                .collect(Collectors.groupingBy(AltinnSalaryRunPermission::getALTINN_SALARY_RUN_ID));
    }

    public Map<Integer, List<AltinnSalaryRunWorkRelationship>> getAltinnSalaryRunWorkRelationShip(List<Integer> altinnRunIds, Integer companyId) {
        List<AltinnSalaryRunWorkRelationship> runItems = entityManager.createNativeQuery(
                        "SELECT asl.* FROM altinn_salary_run_work_relationship asl " +
                                "JOIN altinn_salary_run asr ON asr.SALARY_RUN_ID = asl.ALTINN_SALARY_RUN_ID " +
                                "WHERE asl.ALTINN_SALARY_RUN_ID IN (:altinnRunIds) " +
                                "AND asr.COMPANY_ID = :companyId",
                        AltinnSalaryRunWorkRelationship.class
                )
                .setParameter("companyId", companyId)
                .setParameter("altinnRunIds", altinnRunIds)
                .getResultList();

        return runItems.stream()
                .collect(Collectors.groupingBy(AltinnSalaryRunWorkRelationship::getALTINN_SALARY_RUN_ID));
    }

    public List<AltinnSalaryReport> getAltinnSalaryReportLog(Integer companyId) {
        return entityManager.createQuery("SELECT c FROM AltinnSalaryReport c WHERE c.COMPANY_ID = :companyId", AltinnSalaryReport.class)
                .setParameter("companyId", companyId).getResultList();
    }

    public Map<Integer, List<PaySlipLog>> getPaySlipLog(Set<Integer> salaryRunLogIds, Integer companyId) {
        List<PaySlipLog> logList = entityManager.createNativeQuery("SELECT psl.* FROM pay_slip_log psl JOIN salary_run_log srl ON srl.SALARY_RUN_LOG_ID = psl.SALARY_RUN_LOG_ID \n" +
                        "WHERE psl.SALARY_RUN_LOG_ID IN (:salaryRunLogIds) AND srl.COMPANY_ID =:companyId", PaySlipLog.class)
                .setParameter("companyId", companyId).setParameter("salaryRunLogIds", salaryRunLogIds).getResultList();
        Map<Integer, List<PaySlipLog>> resultMap = logList.stream()
                .collect(Collectors.groupingBy(
                        PaySlipLog::getSALARY_RUN_LOG_ID
                ));
        return resultMap;
    }

    public Map<Integer, List<PaySlipLineItemLog>> getPaySlipLineItemLog(
            List<PaySlipLog> paySlipLogList,
            Integer companyId,
            Set<Integer> salaryRunLogIds) {

        List<PaySlipLineItemLog> lineItemLogList = entityManager.createNativeQuery(
                        "SELECT pli.* FROM pay_slip_line_item_log pli " +
                                "JOIN pay_slip_log pl ON pl.PAY_SLIP_LOG_ID = pli.PAY_SLIP_LOG_ID " +
                                "JOIN salary_run_log srl ON srl.SALARY_RUN_LOG_ID = pl.SALARY_RUN_LOG_ID " +
                                "WHERE srl.SALARY_RUN_LOG_ID IN (:salaryRunLogIds) " +
                                "AND srl.COMPANY_ID = :companyId",
                        PaySlipLineItemLog.class
                )
                .setParameter("companyId", companyId)
                .setParameter("salaryRunLogIds", salaryRunLogIds)
                .getResultList();


        Map<Integer, Integer> paySlipToSalaryRunMap = paySlipLogList.stream()
                .collect(Collectors.toMap(
                        PaySlipLog::getPAY_SLIP_LOG_ID,
                        PaySlipLog::getSALARY_RUN_LOG_ID
                ));


        Map<Integer, List<PaySlipLineItemLog>> resultMap = new HashMap<>();
        for (PaySlipLineItemLog lineItemLog : lineItemLogList) {
            Integer paySlipLogId = lineItemLog.getPAY_SLIP_LOG_ID();
            Integer salaryRunLogId = paySlipToSalaryRunMap.get(paySlipLogId);

            if (salaryRunLogId != null) {
                resultMap.computeIfAbsent(salaryRunLogId, k -> new ArrayList<>()).add(lineItemLog);
            }
        }

        return resultMap;
    }


    public Map<Integer, List<ClaimDetailsLog>> getClaimDetailsLog(Set<Integer> salaryRunLogIds,Integer companyId) {
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT asr.* ")
                .append("FROM CLAIM_DETAILS_LOG asr ")
                .append("LEFT JOIN salary_run_log srl ON srl.SALARY_RUN_LOG_ID = asr.SALARY_RUN_LOG_ID ")
                .append("WHERE srl.COMPANY_ID = :companyId ")
                .append("AND asr.SALARY_RUN_LOG_ID IN (:salaryRunLogIds)");

        List<ClaimDetailsLog> result = entityManager.createNativeQuery(sql.toString(), ClaimDetailsLog.class)
                .setParameter("companyId", companyId)
                .setParameter("salaryRunLogIds", salaryRunLogIds)
                .getResultList();

        return result.stream()
                .collect(Collectors.groupingBy(ClaimDetailsLog::getSALARY_RUN_LOG_ID));
    }

    public Map<Integer, List<CompanyTaxLog>> getComanyTaxLogList(Set<Integer> salaryRunLogIds, Integer companyId) {
        List<CompanyTaxLog> resultLog = entityManager.createNativeQuery("SELECT * FROM company_tax_log ctl WHERE ctl.SALARY_RUN_LOG_ID IN (:salaryRunLogIds) AND ctl.COMPANY_ID =:companyId", CompanyTaxLog.class)
                .setParameter("companyId", companyId).setParameter("salaryRunLogIds", salaryRunLogIds).getResultList();

        return resultLog.stream().collect(Collectors.groupingBy(CompanyTaxLog::getSALARY_RUN_LOG_ID));
    }

    public List<HolidayPayListLog> getHolidayPayListLog(Integer companyId) {
        return entityManager.createQuery("SELECT c FROM HolidayPayListLog c WHERE c.COMPANY_ID = :companyId", HolidayPayListLog.class)
                .setParameter("companyId", companyId).getResultList();
    }

    public List<HolidayPayListLineItemLog> getHolidayPaySlipLineItemLog(Integer companyId) {
        return entityManager.createQuery("SELECT c FROM HolidayPayListLineItemLog c JOIN HolidayPayListLog h ON " +
                "h.HOLIDAY_PAY_LIST_LOG_ID = c.HOLIDAY_PAY_LIST_LOG_ID WHERE h.COMPANY_ID = :companyId").setParameter("companyId", companyId).getResultList();
    }

    public Map<Integer, List<PaySlipPermissionLog>> getPaySlipPermissionLog(
            List<PaySlipLog> paySlipLogList,
            Integer companyId,
            Set<Integer> salaryRunLogIds) {

        List<PaySlipPermissionLog> permissionLogList = entityManager.createNativeQuery(
                        "SELECT psll.* FROM pay_slip_permission_log psll " +
                                "JOIN pay_slip_log pl ON pl.PAY_SLIP_LOG_ID = psll.PAY_SLIP_LOG_ID " +
                                "JOIN salary_run_log srl ON srl.SALARY_RUN_LOG_ID = pl.SALARY_RUN_LOG_ID " +
                                "WHERE srl.SALARY_RUN_LOG_ID IN (:salaryRunLogIds) " +
                                "AND srl.COMPANY_ID = :companyId",
                        PaySlipPermissionLog.class
                )
                .setParameter("salaryRunLogIds", salaryRunLogIds)
                .setParameter("companyId", companyId)
                .getResultList();


        Map<Integer, Integer> paySlipToSalaryRunMap = paySlipLogList.stream()
                .collect(Collectors.toMap(
                        PaySlipLog::getPAY_SLIP_LOG_ID,
                        PaySlipLog::getSALARY_RUN_LOG_ID
                ));

        Map<Integer, List<PaySlipPermissionLog>> resultMap = new HashMap<>();
        for (PaySlipPermissionLog permissionLog : permissionLogList) {
            Integer paySlipLogId = permissionLog.getPAY_SLIP_LOG_ID();
            Integer salaryRunLogId = paySlipToSalaryRunMap.get(paySlipLogId);

            if (salaryRunLogId != null) {
                resultMap.computeIfAbsent(salaryRunLogId, k -> new ArrayList<>()).add(permissionLog);
            }
        }

        return resultMap;
    }


    public Map<Integer, LedgerAccountLog> getLedgerAccountLog(Set<Integer> salaryRunLogIds) {
        List<LedgerAccountLog> ledgerAccountLogs = entityManager.createNativeQuery("SELECT * FROM ledger_account_log lal WHERE lal.SALARY_RUN_LOG_ID IN (:salaryRunLogIds)", LedgerAccountLog.class).setParameter("salaryRunLogIds", salaryRunLogIds).getResultList();

        return ledgerAccountLogs.stream().
                collect(Collectors.toMap(
                        LedgerAccountLog::getSALARY_RUN_LOG_ID , Function.identity()));
    }

    public Map<Integer, List<LedgerAccountLineItemLog>> getLedgerAccountLineItemLog(Set<Integer> salaryRunLogIds) {
        List<LedgerAccountLineItemLog> ledgerAccountLineItemLogs = entityManager.createNativeQuery("SELECT * FROM ledger_account_line_item_log lal WHERE lal.SALARY_RUN_LOG_ID IN (:salaryRunLogIds)",
                LedgerAccountLineItemLog.class).setParameter("salaryRunLogIds", salaryRunLogIds).getResultList();

        return ledgerAccountLineItemLogs.stream().collect(Collectors.groupingBy(LedgerAccountLineItemLog::getSALARY_RUN_LOG_ID));
    }

    public Map<Integer, List<LedgerAccountSalaryReportingCodeLineItemLog>> getLedgerAccountSalaryCodeLog(Set<Integer> salaryRunLogIds) {
        List<LedgerAccountSalaryReportingCodeLineItemLog> resultList = entityManager.createNativeQuery("SELECT * FROM ledger_account_salary_reporting_code_line_item_log lsrcl " +
                        "WHERE lsrcl.SALARY_RUN_LOG_ID IN (:salaryRunLogIds)",LedgerAccountSalaryReportingCodeLineItemLog.class)
                .setParameter("salaryRunLogIds", salaryRunLogIds).getResultList();

        return resultList.stream().collect(Collectors.groupingBy(LedgerAccountSalaryReportingCodeLineItemLog::getSALARY_RUN_LOG_ID));
    }

    public Map<Integer, List<AltinnFeedback>> getAltinnFeedBack(List<Integer> altinnRunId) {

        List<AltinnFeedback> feedbackList = entityManager.createNativeQuery("SELECT * FROM altinn_feedback altfb WHERE altfb.SALARY_RUN_ID IN (:altinnRunId)", AltinnFeedback.class)
                .setParameter("altinnRunId", altinnRunId).getResultList();
        return feedbackList.stream().collect(Collectors.groupingBy(AltinnFeedback::getSALARY_RUN_ID));
    }

    public Map<Integer, List<AltinnFeedbackInfo>> getAltinnFeedbackInfo(List<Integer> altinnRunId) {

        List<AltinnFeedbackInfo> feedbackList = entityManager.createNativeQuery("SELECT * FROM altinn_feedback_info altfb WHERE altfb.SALARY_RUN_ID IN (:altinnRunId)", AltinnFeedbackInfo.class)
                .setParameter("altinnRunId", altinnRunId).getResultList();
        return feedbackList.stream().collect(Collectors.groupingBy(AltinnFeedbackInfo::getSALARY_RUN_ID));
    }

    public Map<Integer, List<AltinnReferenceInfo>> getAltinnReferenceInfo(List<Integer> altinnRunId) {
        List<AltinnReferenceInfo> feedbackList = entityManager.createNativeQuery("SELECT * FROM altinn_reference_info altfb WHERE altfb.SALARY_RUN_ID IN (:altinnRunId)", AltinnReferenceInfo.class)
                .setParameter("altinnRunId", altinnRunId).getResultList();
        return feedbackList.stream().collect(Collectors.groupingBy(AltinnReferenceInfo::getSALARY_RUN_ID));
    }

    public Map<Integer, List<BankListLog>> getBankListLog(Set<Integer> salaryRunLogIds) {
        List<BankListLog> bankListLogs = entityManager.createNativeQuery("SELECT * FROM bank_list_log bll WHERE bll.SALARY_RUN_LOG_ID IN (:salaryRunLogIds)", BankListLog.class)
                .setParameter("salaryRunLogIds", salaryRunLogIds).getResultList();

        return bankListLogs.stream().collect(Collectors.groupingBy(BankListLog::getSALARY_RUN_LOG_ID));
    }

    public Map<Integer, List<BankListLineItemLog>> getBankListLineItemLog(
            Set<Integer> salaryRunLogIds,
            List<BankListLog> bankListLogList, Integer companyId) {

        List<BankListLineItemLog> lineItemLogList = entityManager.createQuery(
                        "SELECT c FROM BankListLineItemLog c " +
                                "JOIN BankListLog b ON b.BANK_LIST_LOG_ID = c.BANK_LIST_LOG_ID " +
                                "JOIN SalaryRunLog s ON s.SALARY_RUN_LOG_ID = b.SALARY_RUN_LOG_ID " +
                                "WHERE s.COMPANY_ID = :companyId " +
                                "AND b.SALARY_RUN_LOG_ID IN (:salaryRunLogIds)",
                        BankListLineItemLog.class
                )
                .setParameter("salaryRunLogIds", salaryRunLogIds)
                .setParameter("companyId", companyId)
                .getResultList();

        Map<Integer, List<BankListLineItemLog>> lineItemsByBankListLogId =
                lineItemLogList.stream()
                        .collect(Collectors.groupingBy(BankListLineItemLog::getBANK_LIST_LOG_ID));

        return bankListLogList.stream()
                .collect(Collectors.toMap(
                        BankListLog::getSALARY_RUN_LOG_ID,
                        b -> lineItemsByBankListLogId.getOrDefault(
                                b.getBANK_LIST_LOG_ID(),
                                Collections.emptyList()
                        ),
                        (list1, list2) -> {
                            List<BankListLineItemLog> merged = new ArrayList<>(list1);
                            merged.addAll(list2);
                            return merged;
                        }
                ));
    }


    public List<SalaryReportLog> getSalaryReportLog(Integer companyId) {
        return entityManager.createQuery("SELECT c FROM SalaryReportLog c WHERE c.COMPANY_ID = :companyId", SalaryReportLog.class)
                .setParameter("companyId", companyId).getResultList();
    }

    public List<BimonthlyReportDetails> getBimonthlyReportDetails(Integer companyId) {
        return entityManager.createQuery("SELECT c FROM BimonthlyReportDetails c JOIN AltinnSalaryReport s " +
                        "ON s.SALARY_REPORT_ID = c.SALARY_REPORT_ID WHERE s.COMPANY_ID = :companyId", BimonthlyReportDetails.class)
                .setParameter("companyId", companyId).getResultList();
    }


//    public List<SalaryPaymentRequestDetails> getSalaryPaymentRequestDetails(Integer companyId) {
//        return entityManager.createQuery("SELECT c FROM SalaryPaymentRequestDetails c ", SalaryPaymentRequestDetails.class).setParameter("companyId", companyId).getResultList();
//    } // need to verify


}
