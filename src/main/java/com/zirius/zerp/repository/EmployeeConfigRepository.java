package com.zirius.zerp.repository;


import com.zirius.zerp.model.BankAccounts;
import com.zirius.zerp.model.Company;
import com.zirius.zerp.model.EmployeeAppointments;
import com.zirius.zerp.model.EmployeeSalaryAccounts;
import com.zirius.zerp.model.EmployeeScheme;
import com.zirius.zerp.model.EmployeeStartUpDetails;
import com.zirius.zerp.model.EmployeeStartUpSalaryCode;
import com.zirius.zerp.model.EmployeeTaxDeduction;
import com.zirius.zerp.model.EmployeeWorkPlace;
import com.zirius.zerp.model.EmployeeWorkerIdDetails;
import com.zirius.zerp.model.UserClaimDetils;
import com.zirius.zerp.model.UserCompany;
import com.zirius.zerp.model.UserCompanySalaryCode;
import com.zirius.zerp.model.UserCompanySalaryConfig;
import com.zirius.zerp.model.UserFreeCarDetails;
import com.zirius.zerp.model.UserSalaryExtension;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.aspectj.weaver.ast.Literal;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeConfigRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<UserCompany> getUserCompanyList(Integer companyId) {
        return entityManager.createQuery("SELECT c FROM UserCompany c WHERE c.COMPANY_ID = :companyId", UserCompany.class)
                .setParameter("companyId", companyId).getResultList();
    }

    public List<EmployeeSalaryAccounts> getEmployeeSalaryAccount(Integer companyId) {

        String query = "SELECT c FROM EmployeeSalaryAccounts c JOIN UserCompany u ON u.USER_COMPANY_ID = c.USER_COMPANY_ID " +
                "WHERE u.COMPANY_ID = :companyId";
        return entityManager.createQuery(query, EmployeeSalaryAccounts.class).setParameter("companyId", companyId).getResultList();
    }

    public List<BankAccounts> getBankAccounts(Integer companyId) {
        return entityManager.createQuery("SELECT c FROM BankAccounts c WHERE c.COMPANY_ID = :companyId", BankAccounts.class)
                .setParameter("companyId", companyId).getResultList();
    }

    public List<EmployeeTaxDeduction> getEmployeeTaxDeduction(Integer companyId) {
        return entityManager.createQuery("SELECT c FROM EmployeeTaxDeduction c JOIN " +
                        "UserCompany u ON u.USER_COMPANY_ID = c.USER_COMPANY_ID WHERE " +
                        "u.COMPANY_ID = :companyId", EmployeeTaxDeduction.class)
                .setParameter("companyId", companyId).getResultList();
    }

    public List<EmployeeAppointments> getEmployeeAppointments(Integer companyID) {
        return entityManager.createQuery("SELECT c FROM EmployeeAppointments c JOIN " +
                        "UserCompany u ON u.USER_COMPANY_ID = c.USER_COMPANY_ID WHERE " +
                                                "u.COMPANY_ID = :companyId", EmployeeAppointments.class)
                .setParameter("companyId", companyID).getResultList();
    }


    public List<EmployeeScheme> getEmployeeScheme(Integer companyID) {
        return entityManager.createQuery("SELECT c FROM EmployeeScheme c JOIN " +
                        "UserCompany u ON u.USER_COMPANY_ID = c.USER_COMPANY_ID WHERE " +
                        "u.COMPANY_ID = :companyId", EmployeeScheme.class)
                .setParameter("companyId", companyID).getResultList();
    }

    public List<EmployeeStartUpDetails> getEmployeeStartUpDetails(Integer companyID) {
        return entityManager.createQuery("SELECT c FROM EmployeeStartUpDetails c JOIN " +
                        "UserCompany u ON u.USER_COMPANY_ID = c.USER_COMPANY_ID WHERE u.COMPANY_ID = :companyId", EmployeeStartUpDetails.class)
                .setParameter("companyId", companyID).getResultList();
    }

    public List<EmployeeStartUpSalaryCode> getEmployeeStartUpCodes(Integer companyId) {
        return entityManager.createQuery("SELECT c FROM EmployeeStartUpSalaryCode c JOIN " +
                        "UserCompany u ON u.USER_COMPANY_ID = c.USER_COMPANY_ID WHERE u.COMPANY_ID = :companyId", EmployeeStartUpSalaryCode.class)
                .setParameter("companyId", companyId).getResultList();
    }

    public List<EmployeeWorkPlace> getEmployeeWorkPlaceList(Integer companyId) {
        return entityManager.createQuery("SELECT c FROM EmployeeWorkPlace c JOIN " +
                        "UserCompany u ON u.USER_COMPANY_ID = c.USER_COMPANY_ID WHERE u.COMPANY_ID = :companyId", EmployeeWorkPlace.class)
                .setParameter("companyId", companyId).getResultList();
    }

    public List<EmployeeWorkerIdDetails> getEmployeeWorkerIdDetails(Integer companyId) {
        return entityManager.createQuery("SELECT c FROM EmployeeWorkerIdDetails c JOIN " +
                        "UserCompany u ON u.USER_COMPANY_ID = c.USER_COMPANY_ID WHERE u.COMPANY_ID = :companyId", EmployeeWorkerIdDetails.class)
                .setParameter("companyId", companyId).getResultList();
    }

    public List<UserFreeCarDetails> getEmployeeFreeCarDetails(Integer companyId) {
        return entityManager.createQuery("SELECT c FROM UserFreeCarDetails c JOIN " +
                        "UserCompany u ON u.USER_COMPANY_ID = c.USER_COMPANY_ID WHERE u.COMPANY_ID = :companyId", UserFreeCarDetails.class)
                .setParameter("companyId", companyId).getResultList();
    }

    public List<UserClaimDetils> getUserClaimDetails(Integer companyId) {
        return entityManager.createQuery("SELECT c FROM UserClaimDetils c JOIN " +
                        "UserCompany u ON u.USER_COMPANY_ID = c.USER_COMPANY_ID WHERE u.COMPANY_ID = :companyId", UserClaimDetils.class)
                .setParameter("companyId", companyId).getResultList();
    }

    public List<UserCompanySalaryConfig> getUserCompanySalaryConfig(Integer companyId) {
        return entityManager.createQuery("SELECT c FROM UserCompanySalaryConfig c JOIN " +
                        "UserCompany u ON u.USER_COMPANY_ID = c.USER_COMPANY_ID WHERE u.COMPANY_ID = :companyId", UserCompanySalaryConfig.class)
                .setParameter("companyId", companyId).getResultList();
    }
    
    public List<UserCompanySalaryCode> getUserCompanySalaryCode(Integer companyId) {
        return entityManager.createQuery("SELECT c FROM UserCompanySalaryCode c JOIN " +
                        "UserCompany u ON u.USER_COMPANY_ID = c.USER_COMPANY_ID WHERE u.COMPANY_ID = :companyId", UserCompanySalaryCode.class)
                .setParameter("companyId", companyId).getResultList();
    }

    public List<UserSalaryExtension> getUserCompanySalaryExtension(Integer companyId) {
        return entityManager.createQuery("SELECT c FROM UserSalaryExtension c WHERE c.COMPANY_ID = :companyId", UserSalaryExtension.class)
                .setParameter("companyId", companyId).getResultList();
    }

}
