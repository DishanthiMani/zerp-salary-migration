package com.zirius.zerp.repository.zerpRepo;

import com.zirius.zerp.dto.SalaryReportingCodeDetailsDTO;
import com.zirius.zerp.model.zerpapp.AltinnUser;
import com.zirius.zerp.model.zerpapp.ClaimCollectorDetails;
import com.zirius.zerp.model.zerpapp.ClaimCollectorValues;
import com.zirius.zerp.model.zerpapp.Company;
import com.zirius.zerp.model.zerpapp.CompanyFreeCarBenefits;
import com.zirius.zerp.model.zerpapp.CompanyFreeCarDetails;
import com.zirius.zerp.model.zerpapp.CompanyFreeCarInsurance;
import com.zirius.zerp.model.zerpapp.CompanyFreeCarSetting;
import com.zirius.zerp.model.zerpapp.CompanyPensionOTP;
import com.zirius.zerp.model.zerpapp.CompanySalaryDetails;
import com.zirius.zerp.model.zerpapp.CompanyWorkPlace;
import com.zirius.zerp.model.zerpapp.CompanyWorkPlaceMunicipality;
import com.zirius.zerp.model.zerpapp.Department;
import com.zirius.zerp.model.zerpapp.LedgerAccount;
import com.zirius.zerp.model.zerpapp.SalaryGroup;
import com.zirius.zerp.model.zerpapp.SalaryReportingCode;
import com.zirius.zerp.model.zerpapp.SalaryReportingCodeAmessage;
import com.zirius.zerp.model.zerpapp.SalaryReportingCodeBasis;
import com.zirius.zerp.model.zerpapp.SalaryYearlyConstant;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.aspectj.lang.reflect.DeclareParents;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CompanyConfigRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public Company getCompanyDetails(Integer companyId) {
        return entityManager.createQuery("SELECT c FROM Company c WHERE c.COMPANY_ID = :companyId", Company.class)
                .setParameter("companyId", companyId).getSingleResult();
    }

    public List<SalaryGroup> getSalaryGroups(Integer companyId) {
        return entityManager.createQuery(
                        "SELECT s FROM SalaryGroup s WHERE s.COMPANY_ID = :companyId", SalaryGroup.class)
                .setParameter("companyId", companyId)
                .getResultList();
    }

    public List<SalaryReportingCode> getSalaryCodes(Integer companyId) {
        return entityManager.createQuery(
                        "SELECT c FROM SalaryReportingCode c WHERE c.COMPANY_ID = :companyId", SalaryReportingCode.class)
                .setParameter("companyId", companyId)
                .getResultList();
    }

    public List<LedgerAccount> getLedgerAccountList() {
        return entityManager.createQuery("SELECT c FROM LedgerAccount c", LedgerAccount.class).getResultList();
    }

//    public List<SalaryReportingCodeDetailsDTO> getSalaryCodeDetails(Integer companyId) {
//        String query = "SELECT new com.zirius.zerp.dto.SalaryReportingCodeDetailsDTO(" +
//                "c.SALARY_REPORTING_CODE_ID, c.SALARY_REPORTING_CODE, c.SALARY_REPORTING_CODE_NAME, " +
//                "c.ACCOUNT_ID, c.CREDIT_ACCOUNT_ID, c.SALARY_TYPE_ID, c.COST_PRICE, c.SALE_PRICE, c.IS_ACTIVE, " +
//                "c.COMPANY_ID, sm.SALARY_DESCRIPTION, sm.BENEFITS, sm.IS_SPECIFICATION, " +
//                "sb.IS_HOLIDAY_PAY, sb.IS_PAYROLL_TAX, sb.IS_UNION, sb.IS_PENSION, sb.TAXES_ID, sb.PENSION_ID, " +
//                "sb.SSB_ID, sb.SALARY_CODE_RATE_TYPE_ID, sb.SALARY_CODE_YEARLY_RATE_TYPE_ID, " +
//                "c.VERSION, c.CREATED_DATETIME, c.MODIFIED_DATETIME" +
//                ") FROM SalaryReportingCode c " +
//                "JOIN SalaryReportingCodeAmessage sm ON sm.SALARY_REPORTING_CODE_ID = c.SALARY_REPORTING_CODE_ID " +
//                "JOIN SalaryReportingCodeBasis sb ON sb.SALARY_REPORTING_CODE_ID = c.SALARY_REPORTING_CODE_ID " +
//                "WHERE c.COMPANY_ID = :companyId";
//        return entityManager.createQuery(query, SalaryReportingCodeDetailsDTO.class).setParameter("companyId", companyId).getResultList();
//    }

    public List<CompanyWorkPlace> getCompanyWorkPlace(Integer companyId) {
        return entityManager.createQuery("SELECT c FROM CompanyWorkPlace c WHERE c.COMPANY_ID = :companyId", CompanyWorkPlace.class)
                .setParameter("companyId", companyId)
                .getResultList();
    }

    public List<CompanyWorkPlaceMunicipality> getCompanyWorkPlaceMunicipality(Integer companyId) {
        return entityManager.createQuery("SELECT c FROM CompanyWorkPlaceMunicipality c JOIN CompanyWorkPlace w ON c.WORK_PLACE_ID = w.WORK_PLACE_ID" +
                        " WHERE w.COMPANY_ID = :companyId", CompanyWorkPlaceMunicipality.class)
                .setParameter("companyId", companyId).getResultList();
    }

    public List<SalaryReportingCodeAmessage> getSalaryCodeAMessage(Integer companyId) {
        return entityManager.createQuery("SELECT m FROM SalaryReportingCodeAmessage m JOIN SalaryReportingCode c on " +
                "c.SALARY_REPORTING_CODE_ID = m.SALARY_REPORTING_CODE_ID WHERE c.COMPANY_ID = :companyId", SalaryReportingCodeAmessage.class)
                .setParameter("companyId" , companyId).getResultList();
    }

    public List<SalaryReportingCodeBasis> getSalaryCodeBasis(Integer companyId) {
        return entityManager.createQuery("SELECT m FROM SalaryReportingCodeBasis m JOIN SalaryReportingCode c on " +
                        "c.SALARY_REPORTING_CODE_ID = m.SALARY_REPORTING_CODE_ID WHERE c.COMPANY_ID = :companyId", SalaryReportingCodeBasis.class)
                .setParameter("companyId" , companyId).getResultList();
    }


    public List<ClaimCollectorDetails> getClaimCollectorDetails(Integer companyId) {
        return entityManager.createQuery("SELECT c FROM ClaimCollectorDetails c WHERE c.COMPANY_ID = :companyId", ClaimCollectorDetails.class)
                .setParameter("companyId", companyId).getResultList();
    }

    public List<ClaimCollectorValues> getClaimCollectorValues(Integer companyId) {
        return entityManager.createQuery("SELECT c FROM ClaimCollectorValues c JOIN ClaimCollectorDetails cd ON " +
                "cd.CLAIM_COLLECTORS_VALUES_ID = c.CLAIM_COLLECTORS_VALUES_ID WHERE cd.COMPANY_ID = :companyId", ClaimCollectorValues.class)
                .setParameter("companyId", companyId).getResultList();
    }

    public List<Department> getDepartmentList(Integer companyId) {
        return entityManager.createQuery("SELECT c FROM Department c WHERE c.COMPANY_ID = :companyId", Department.class)
                .setParameter("companyId", companyId).getResultList();
    }

    public List<SalaryYearlyConstant> getYearlyConstants(Integer companyId) {
        Query query = entityManager.createQuery(
                "SELECT y FROM SalaryYearlyConstant y WHERE y.COMPANY_ID = :companyId", SalaryYearlyConstant.class);
        query.setParameter("companyId", companyId);

        System.out.println("JPQL: " + query.unwrap(org.hibernate.query.Query.class).getQueryString());

        return entityManager.createQuery(
                        "SELECT y FROM SalaryYearlyConstant y WHERE y.COMPANY_ID = :companyId", SalaryYearlyConstant.class)
                .setParameter("companyId", companyId)
                .getResultList();
    }

    public CompanySalaryDetails getCompanySalaryDetails(Integer companyId) {
        return entityManager.createQuery("SELECT d FROM CompanySalaryDetails d WHERE d.COMPANY_ID = :companyId", CompanySalaryDetails.class)
                .setParameter("companyId", companyId).getSingleResult();
    }

    public List<CompanyPensionOTP> getCompanyPensionOtp(Integer companyId) {
        return entityManager.createQuery("SELECT p FROM CompanyPensionOTP p WHERE p.COMPANY_ID = :companyId", CompanyPensionOTP.class)
                .setParameter("companyId", companyId).getResultList();
    }

    public List<CompanyFreeCarDetails> getCompanyFreeCarDetails(Integer companyId) {
        return entityManager.createQuery("SELECT c FROM CompanyFreeCarDetails c WHERE c.COMPANY_ID = :companyId", CompanyFreeCarDetails.class)
                .setParameter("companyId", companyId).getResultList();
    }

    public List<CompanyFreeCarBenefits> getCompanyFreeCarBenefits(Integer companyId) {
        return entityManager.createQuery("SELECT c FROM CompanyFreeCarBenefits c WHERE c.COMPANY_ID = :companyId", CompanyFreeCarBenefits.class)
                .setParameter("companyId", companyId).getResultList();
    }

    public List<CompanyFreeCarInsurance> getCompanyFreeCarInsurance(Integer companyId) {
        return entityManager.createQuery("SELECT c FROM CompanyFreeCarInsurance c WHERE c.COMPANY_ID = :companyId", CompanyFreeCarInsurance.class)
                .setParameter("companyId", companyId).getResultList();
    }

    public List<CompanyFreeCarSetting> getCompanyFreeCarSetting(Integer companyId) {
        return entityManager.createQuery("SELECT c FROM CompanyFreeCarSetting c WHERE c.COMPANY_ID = :companyId", CompanyFreeCarSetting.class)
                .setParameter("companyId", companyId).getResultList();
    }

    public List<AltinnUser> getCompanyAltinnUser(Integer companyId) {
        return entityManager.createQuery("SELECT c FROM AltinnUser c JOIN UserCompany uc ON " +
                        "uc.USER_COMPANY_ID = c.USER_COMPANY_ID WHERE uc.COMPANY_ID = :companyId", AltinnUser.class)
                .setParameter("companyId", companyId).getResultList();
    }
}
