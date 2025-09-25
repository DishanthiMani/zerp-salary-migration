package com.zirius.zerp.repository.zerpRepo;


import com.zirius.zerp.model.zerpapp.AppUser;
import com.zirius.zerp.model.zerpapp.BankAccounts;
import com.zirius.zerp.model.zerpapp.EmployeeAppointments;
import com.zirius.zerp.model.zerpapp.EmployeePermission;
import com.zirius.zerp.model.zerpapp.EmployeeSalaryAccounts;
import com.zirius.zerp.model.zerpapp.EmployeeScheme;
import com.zirius.zerp.model.zerpapp.EmployeeStartUpDetails;
import com.zirius.zerp.model.zerpapp.EmployeeStartUpSalaryCode;
import com.zirius.zerp.model.zerpapp.EmployeeTaxDeduction;
import com.zirius.zerp.model.zerpapp.EmployeeWorkPlace;
import com.zirius.zerp.model.zerpapp.EmployeeWorkerIdDetails;
import com.zirius.zerp.model.zerpapp.UserClaimDetils;
import com.zirius.zerp.model.zerpapp.UserCompany;
import com.zirius.zerp.model.zerpapp.UserCompanySalaryCode;
import com.zirius.zerp.model.zerpapp.UserCompanySalaryConfig;
import com.zirius.zerp.model.zerpapp.UserFreeCarDetails;
import com.zirius.zerp.model.zerpapp.UserSalaryExtension;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class EmployeeConfigRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<UserCompany> getUserCompanyList(Integer companyId) {
        return entityManager.createQuery("SELECT c FROM UserCompany c WHERE c.COMPANY_ID = :companyId", UserCompany.class)
                .setParameter("companyId", companyId).getResultList();
    }

    public List<AppUser> getAppUserList(List<Integer> ids) {
        return entityManager.createQuery(
                        "SELECT c FROM AppUser c WHERE c.USER_ID IN :ids", AppUser.class)
                .setParameter("ids", ids)
                .getResultList();
    }

    public List<BankAccounts> getBankAccounts(Integer companyId) {
        return entityManager.createQuery("SELECT c FROM BankAccounts c WHERE c.COMPANY_ID = :companyId", BankAccounts.class)
                .setParameter("companyId", companyId).getResultList();
    }


    public Map<Integer, List<EmployeeSalaryAccounts>> getEmployeeSalaryAccount(Integer companyId) {
        String query = "SELECT c FROM EmployeeSalaryAccounts c JOIN UserCompany u ON u.USER_COMPANY_ID = c.USER_COMPANY_ID " +
                "WHERE u.COMPANY_ID = :companyId";
        return entityManager.createQuery(query, EmployeeSalaryAccounts.class)
                .setParameter("companyId", companyId)
                .getResultList()
                .stream()
                .collect(Collectors.groupingBy(c -> c.getUSER_COMPANY_ID()));
    }

    public Map<Integer, List<EmployeeTaxDeduction>> getEmployeeTaxDeduction(Integer companyId) {
        return entityManager.createQuery("SELECT c FROM EmployeeTaxDeduction c JOIN " +
                        "UserCompany u ON u.USER_COMPANY_ID = c.USER_COMPANY_ID WHERE u.COMPANY_ID = :companyId", EmployeeTaxDeduction.class)
                .setParameter("companyId", companyId)
                .getResultList()
                .stream()
                .collect(Collectors.groupingBy(c -> c.getUSER_COMPANY_ID()));
    }

    public Map<Integer, List<EmployeeAppointments>> getEmployeeAppointments(Integer companyId) {
        return entityManager.createQuery("SELECT c FROM EmployeeAppointments c JOIN " +
                        "UserCompany u ON u.USER_COMPANY_ID = c.USER_COMPANY_ID WHERE u.COMPANY_ID = :companyId", EmployeeAppointments.class)
                .setParameter("companyId", companyId)
                .getResultList()
                .stream()
                .collect(Collectors.groupingBy(c -> c.getUSER_COMPANY_ID()));
    }

    public Map<Integer, List<EmployeeScheme>> getEmployeeScheme(Integer companyId) {
        return entityManager.createQuery("SELECT c FROM EmployeeScheme c JOIN " +
                        "UserCompany u ON u.USER_COMPANY_ID = c.USER_COMPANY_ID WHERE u.COMPANY_ID = :companyId", EmployeeScheme.class)
                .setParameter("companyId", companyId)
                .getResultList()
                .stream()
                .collect(Collectors.groupingBy(c -> c.getUSER_COMPANY_ID()));
    }

    public Map<Integer, List<EmployeeStartUpDetails>> getEmployeeStartUpDetails(Integer companyId) {
        return entityManager.createQuery("SELECT c FROM EmployeeStartUpDetails c JOIN " +
                        "UserCompany u ON u.USER_COMPANY_ID = c.USER_COMPANY_ID WHERE u.COMPANY_ID = :companyId", EmployeeStartUpDetails.class)
                .setParameter("companyId", companyId)
                .getResultList()
                .stream()
                .collect(Collectors.groupingBy(c -> c.getUSER_COMPANY_ID()));
    }

    public Map<Integer, List<EmployeeStartUpSalaryCode>> getEmployeeStartUpCodes(Integer companyId) {
        return entityManager.createQuery("SELECT c FROM EmployeeStartUpSalaryCode c JOIN " +
                        "UserCompany u ON u.USER_COMPANY_ID = c.USER_COMPANY_ID WHERE u.COMPANY_ID = :companyId", EmployeeStartUpSalaryCode.class)
                .setParameter("companyId", companyId)
                .getResultList()
                .stream()
                .collect(Collectors.groupingBy(c -> c.getUSER_COMPANY_ID()));
    }

    public Map<Integer, List<EmployeeWorkPlace>> getEmployeeWorkPlaceList(Integer companyId) {
        return entityManager.createQuery("SELECT c FROM EmployeeWorkPlace c JOIN " +
                        "UserCompany u ON u.USER_COMPANY_ID = c.USER_COMPANY_ID WHERE u.COMPANY_ID = :companyId", EmployeeWorkPlace.class)
                .setParameter("companyId", companyId)
                .getResultList()
                .stream()
                .collect(Collectors.groupingBy(c -> c.getUSER_COMPANY_ID()));
    }

    public Map<Integer, List<EmployeeWorkerIdDetails>> getEmployeeWorkerIdDetails(Integer companyId) {
        return entityManager.createQuery("SELECT c FROM EmployeeWorkerIdDetails c JOIN " +
                        "UserCompany u ON u.USER_COMPANY_ID = c.USER_COMPANY_ID WHERE u.COMPANY_ID = :companyId", EmployeeWorkerIdDetails.class)
                .setParameter("companyId", companyId)
                .getResultList()
                .stream()
                .collect(Collectors.groupingBy(c -> c.getUSER_COMPANY_ID()));
    }

    public Map<Integer, List<UserFreeCarDetails>> getEmployeeFreeCarDetails(Integer companyId) {
        return entityManager.createQuery("SELECT c FROM UserFreeCarDetails c JOIN " +
                        "UserCompany u ON u.USER_COMPANY_ID = c.USER_COMPANY_ID WHERE u.COMPANY_ID = :companyId", UserFreeCarDetails.class)
                .setParameter("companyId", companyId)
                .getResultList()
                .stream()
                .collect(Collectors.groupingBy(c -> c.getUSER_COMPANY_ID()));
    }

    public Map<Integer, List<UserClaimDetils>> getUserClaimDetails(Integer companyId) {
        return entityManager.createQuery("SELECT c FROM UserClaimDetils c JOIN " +
                        "UserCompany u ON u.USER_COMPANY_ID = c.USER_COMPANY_ID WHERE u.COMPANY_ID = :companyId", UserClaimDetils.class)
                .setParameter("companyId", companyId)
                .getResultList()
                .stream()
                .collect(Collectors.groupingBy(c -> c.getUSER_COMPANY_ID()));
    }

    public Map<Integer, List<UserCompanySalaryConfig>> getUserCompanySalaryConfig(Integer companyId) {
        return entityManager.createQuery("SELECT c FROM UserCompanySalaryConfig c JOIN " +
                        "UserCompany u ON u.USER_COMPANY_ID = c.USER_COMPANY_ID WHERE u.COMPANY_ID = :companyId", UserCompanySalaryConfig.class)
                .setParameter("companyId", companyId)
                .getResultList()
                .stream()
                .collect(Collectors.groupingBy(c -> c.getUSER_COMPANY_ID()));
    }

    public Map<Integer, List<UserCompanySalaryCode>> getUserCompanySalaryCode(Integer companyId) {
        return entityManager.createQuery("SELECT c FROM UserCompanySalaryCode c JOIN " +
                        "UserCompany u ON u.USER_COMPANY_ID = c.USER_COMPANY_ID WHERE u.COMPANY_ID = :companyId", UserCompanySalaryCode.class)
                .setParameter("companyId", companyId)
                .getResultList()
                .stream()
                .collect(Collectors.groupingBy(c -> c.getUSER_COMPANY_ID()));
    }

    public Map<Integer, List<UserSalaryExtension>> getUserCompanySalaryExtension(Integer companyId) {
        return entityManager.createQuery("SELECT c FROM UserSalaryExtension c JOIN UserCompany u ON u.USER_COMPANY_ID = c.USER_COMPANY_ID WHERE c.COMPANY_ID = :companyId", UserSalaryExtension.class)
                .setParameter("companyId", companyId)
                .getResultList()
                .stream()
                .collect(Collectors.groupingBy(c -> c.getUSER_COMPANY_ID()));
    }

    public Map<Integer, List<EmployeePermission>> getEmployeePermission(Integer companyId) {
        return entityManager.createQuery("SELECT c FROM EmployeePermission c JOIN UserCompany u ON u.USER_COMPANY_ID = c.USER_COMPANY_ID WHERE c.COMPANY_ID = :companyId", EmployeePermission.class)
                .setParameter("companyId", companyId)
                .getResultList()
                .stream()
                .collect(Collectors.groupingBy(c -> c.getUSER_COMPANY_ID()));
    }


}
