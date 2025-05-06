package com.zirius.zerp.repository;

import com.zirius.zerp.model.AltinnFeedback;
import com.zirius.zerp.model.AltinnFeedbackInfo;
import com.zirius.zerp.model.AltinnReferenceInfo;
import com.zirius.zerp.model.AltinnSalaryReport;
import com.zirius.zerp.model.AltinnSalaryRun;
import com.zirius.zerp.model.AltinnSalaryRunLineItem;
import com.zirius.zerp.model.AltinnSalaryRunPermission;
import com.zirius.zerp.model.AltinnSalaryRunWorkRelationship;
import com.zirius.zerp.model.AltinnSalaryTaxInfo;
import com.zirius.zerp.model.AltinnSalaryTaxInfoUsers;
import com.zirius.zerp.model.BankListLineItemLog;
import com.zirius.zerp.model.BankListLog;
import com.zirius.zerp.model.ClaimDetailsLog;
import com.zirius.zerp.model.CompanyTaxLog;
import com.zirius.zerp.model.EmployeeTaxWithholdingDetails;
import com.zirius.zerp.model.HolidayPayListLineItemLog;
import com.zirius.zerp.model.HolidayPayListLog;
import com.zirius.zerp.model.LedgerAccountLineItemLog;
import com.zirius.zerp.model.LedgerAccountLog;
import com.zirius.zerp.model.LedgerAccountSalaryReportingCodeLineItemLog;
import com.zirius.zerp.model.PaySlipLineItemLog;
import com.zirius.zerp.model.PaySlipLog;
import com.zirius.zerp.model.PaySlipPermissionLog;
import com.zirius.zerp.model.SalaryEmployeeTaxDetails;
import com.zirius.zerp.model.SalaryPaymentRequestDetails;
import com.zirius.zerp.model.SalaryRunLog;
import com.zirius.zerp.model.SalaryTaxInfoLog;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

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

    public List<SalaryRunLog> getSalaryRunLogList(Integer companyId) {
        return entityManager.createQuery("SELECT c FROM SalaryRunLog c WHERE c.COMPANY_ID = :companyId", SalaryRunLog.class)
                .setParameter("companyId", companyId).getResultList();
    }

    public List<AltinnSalaryRun> getAltinnSalaryRunList(Integer companyId) {
        return entityManager.createQuery("SELECT c FROM AltinnSalaryRun c WHERE c.COMPANY_ID = :companyId", AltinnSalaryRun.class)
                .setParameter("companyId", companyId).getResultList();
    }

    public List<AltinnSalaryRunLineItem> getAltinnSalaryRunLineItems(Integer companyId) {
        return entityManager.createQuery("SELECT c FROM AltinnSalaryRunLineItem c JOIN AltinnSalaryRun a " +
                        "ON a.SALARY_RUN_ID = c.SALARY_RUN_ID WHERE a.COMPANY_ID = :companyId", AltinnSalaryRunLineItem.class)
                .setParameter("companyId", companyId).getResultList();
    }

    public List<AltinnSalaryRunPermission> getAltinnSalaryRunPermission(Integer companyId) {
        return entityManager.createQuery("SELECT c FROM AltinnSalaryRunPermission c JOIN AltinnSalaryRun a " +
                        "ON a.SALARY_RUN_ID = c.ALTINN_SALARY_RUN_ID WHERE a.COMPANY_ID = :companyId", AltinnSalaryRunPermission.class)
                .setParameter("companyId", companyId).getResultList();
    }

    public List<AltinnSalaryRunWorkRelationship> getAltinnSalaryRunWorkRelationShip(Integer companyId) {
        return entityManager.createQuery("SELECT c FROM AltinnSalaryRunWorkRelationship c JOIN AltinnSalaryRun a " +
                        "ON a.SALARY_RUN_ID = c.ALTINN_SALARY_RUN_ID WHERE a.COMPANY_ID = :companyId", AltinnSalaryRunWorkRelationship.class)
                .setParameter("companyId", companyId).getResultList();
    }

    public List<AltinnSalaryReport> getAltinnSalaryReportLog(Integer companyId) {
        return entityManager.createQuery("SELECT c FROM AltinnSalaryReport c WHERE c.COMPANY_ID = :companyId", AltinnSalaryReport.class)
                .setParameter("companyId", companyId).getResultList();
    }

    public List<PaySlipLog> getPaySlipLog(Integer companyId) {
        return entityManager.createQuery("SELECT c FROM PaySlipLog c JOIN SalaryRunLog s ON s.SALARY_RUN_LOG_ID = c.SALARY_RUN_LOG_ID " +
                        "WHERE s.COMPANY_ID = :companyId", PaySlipLog.class)
                .setParameter("companyId", companyId).getResultList();
    }

    public List<PaySlipLineItemLog> getPaySlipLineItemLog(Integer companyId) {
        return entityManager.createQuery("SELECT c FROM PaySlipLineItemLog c JOIN PaySlipLog p ON p.PAY_SLIP_LOG_ID = c.PAY_SLIP_LOG_ID " +
                "JOIN SalaryRunLog s ON s.SALARY_RUN_LOG_ID = p.SALARY_RUN_LOG_ID WHERE s.COMPANY_ID = :companyId", PaySlipLineItemLog.class)
                .setParameter("companyId", companyId).getResultList();
    }

    public List<ClaimDetailsLog> getClaimDetailsLog(Integer companyId) {
        return entityManager.createQuery("SELECT c FROM ClaimDetailsLog c JOIN SalaryRunLog s ON s.SALARY_RUN_LOG_ID = c.SALARY_RUN_LOG_ID " +
                "WHERE s.COMPANY_ID = :companyId", ClaimDetailsLog.class).setParameter("companyId", companyId).getResultList();
    }

    public List<CompanyTaxLog> getComanyTaxLogList(Integer companyId) {
        return entityManager.createQuery("SELECT c FROM CompanyTaxLog c WHERE c.COMPANY_ID = :companyId", CompanyTaxLog.class)
                .setParameter("companyId", companyId).getResultList();
    }

    public List<HolidayPayListLog> getHolidayPayListLog(Integer companyId) {
        return entityManager.createQuery("SELECT c FROM HolidayPayListLog c WHERE c.COMPANY_ID = :companyId", HolidayPayListLog.class)
                .setParameter("companyId", companyId).getResultList();
    }

    public List<HolidayPayListLineItemLog> getHolidayPaySlipLineItemLog(Integer companyId) {
        return entityManager.createQuery("SELECT c FROM HolidayPayListLineItemLog c JOIN HolidayPayListLog h ON " +
                "h.HOLIDAY_PAY_LIST_LOG_ID = c.HOLIDAY_PAY_LIST_LOG_ID WHERE h.COMPANY_ID = :companyId").setParameter("companyId", companyId).getResultList();
    }

    public List<PaySlipPermissionLog> getPaySlipPermissionLog(Integer companyId) {
        return entityManager.createQuery("SELECT c FROM PaySlipPermissionLog c WHERE c.COMPANY_ID = :companyId", PaySlipPermissionLog.class)
                .setParameter("companyId", companyId).getResultList();
    }

    public List<LedgerAccountLog> getLedgerAccountLog(Integer companyId) {
        return entityManager.createQuery("SELECT c FROM LedgerAccountLog c JOIN SalaryRunLog s ON s.SALARY_RUN_LOG_ID = c.SALARY_RUN_LOG_ID " +
                "WHERE s.COMPANY_ID = :companyId", LedgerAccountLog.class).setParameter("companyId", companyId).getResultList();
    }

    public List<LedgerAccountLineItemLog> getLedgerAccountLineItemLog(Integer companyId) {
        return entityManager.createQuery("SELECT c FROM LedgerAccountLineItemLog c JOIN SalaryRunLog s ON s.SALARY_RUN_LOG_ID = c.SALARY_RUN_LOG_ID " +
                "WHERE s.COMPANY_ID = :companyId", LedgerAccountLineItemLog.class).setParameter("companyId", companyId).getResultList();
    }

    public List<LedgerAccountSalaryReportingCodeLineItemLog> getLedgerAccountSalaryCodeLog(Integer companyId) {
        return entityManager.createQuery("SELECT c FROM LedgerAccountSalaryReportingCodeLineItemLog c JOIN SalaryRunLog s ON s.SALARY_RUN_LOG_ID = " +
                        "c.SALARY_RUN_LOG_ID WHERE s.COMPANY_ID = :companyId",LedgerAccountSalaryReportingCodeLineItemLog.class)
                .setParameter("companyId", companyId).getResultList();
    }

    public List<AltinnFeedback> getAltinnFeedBack(Integer companyId) {
        return entityManager.createQuery("SELECT c FROM AltinnFeedback c JOIN AltinnSalaryRun a ON a.SALARY_RUN_ID = c.SALARY_RUN_ID " +
                        "WHERE a.COMPANY_ID = :companyId", AltinnFeedback.class)
                .setParameter("companyId", companyId).getResultList();
    }

    public List<AltinnFeedbackInfo> getAltinnFeedbackInfo(Integer companyId) {
        return entityManager.createQuery("SELECT c FROM AltinnFeedbackInfo c JOIN AltinnSalaryRun a ON a.SALARY_RUN_ID = c.SALARY_RUN_ID " +
                "WHERE a.COMPANY_ID = :companyId", AltinnFeedbackInfo.class)
                .setParameter("companyId", companyId).getResultList();
    }

    public List<AltinnReferenceInfo> getAltinnReferenceInfo(Integer companyId) {
        return entityManager.createQuery("SELECT c FROM AltinnReferenceInfo c JOIN AltinnSalaryRun a ON a.SALARY_RUN_ID = c.SALARY_RUN_ID " +
                        "WHERE a.COMPANY_ID = :companyId", AltinnReferenceInfo.class)
                .setParameter("companyId", companyId).getResultList();
    }

    public List<BankListLog> getBankListLog(Integer companyId) {
        return entityManager.createQuery("SELECT c FROM BankListLog c JOIN SalaryRunLog s ON s.SALARY_RUN_LOG_ID = c.SALARY_RUN_LOG_ID " +
                "WHERE s.COMPANY_ID = :companyId", BankListLog.class).setParameter("companyId", companyId).getResultList();
    }

    public List<BankListLineItemLog> getBankListLineItemLog(Integer companyId) {
        return entityManager.createQuery("SELECT c FROM BankListLineItemLog c JOIN BankListLog b ON b.BANK_LIST_LOG_ID = c.BANK_LIST_LOG_ID " +
                "JOIN SalaryRunLog s ON s.SALARY_RUN_LOG_ID = b.SALARY_RUN_LOG_ID WHERE s.COMPANY_ID = :companyId", BankListLineItemLog.class)
                .setParameter("companyId", companyId).getResultList();
    }

//    public List<SalaryPaymentRequestDetails> getSalaryPaymentRequestDetails(Integer companyId) {
//        return entityManager.createQuery("SELECT c FROM SalaryPaymentRequestDetails c ", SalaryPaymentRequestDetails.class).setParameter("companyId", companyId).getResultList();
//    } // need to verify


}
