package com.zirius.zerp.service;

import com.zirius.zerp.dto.EmployeeConfigDTO;
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
import com.zirius.zerp.model.zerpapp.UserClaimDetils;
import com.zirius.zerp.model.zerpapp.UserCompany;
import com.zirius.zerp.model.zerpapp.UserCompanySalaryCode;
import com.zirius.zerp.model.zerpapp.UserCompanySalaryConfig;
import com.zirius.zerp.model.zerpapp.UserFreeCarDetails;
import com.zirius.zerp.model.zerpapp.UserSalaryExtension;
import com.zirius.zerp.repository.zerpRepo.EmployeeConfigRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class EmployeeConfigService {

    @Autowired
    private EmployeeConfigRepository employeeConfigRepository;


    public List<EmployeeConfigDTO> getEmployeeConfiguration(Integer companyId, List<UserCompany> userCompanyList) {

        List<EmployeeConfigDTO> employeeConfigList = new ArrayList<>();

        Map<Integer, List<EmployeeSalaryAccounts>> employeeSalaryAccounts = employeeConfigRepository.getEmployeeSalaryAccount(companyId);
// Map<Integer, List<BankAccounts>> bankAccounts = employeeConfigRepository.getBankAccounts(companyId);
        Map<Integer, List<EmployeeTaxDeduction>> employeeTaxDeductions = employeeConfigRepository.getEmployeeTaxDeduction(companyId);
        Map<Integer, List<EmployeeAppointments>> employeeAppointments = employeeConfigRepository.getEmployeeAppointments(companyId);
        Map<Integer, List<EmployeeScheme>> employeeSchemes = employeeConfigRepository.getEmployeeScheme(companyId);
        Map<Integer, List<EmployeeStartUpDetails>> employeeStartUpDetails = employeeConfigRepository.getEmployeeStartUpDetails(companyId);
        Map<Integer, List<EmployeeStartUpSalaryCode>> employeeStartUpSalaryCodes = employeeConfigRepository.getEmployeeStartUpCodes(companyId);
        Map<Integer, List<EmployeeWorkPlace>> employeeWorkPlaces = employeeConfigRepository.getEmployeeWorkPlaceList(companyId);
        Map<Integer, List<UserFreeCarDetails>> employeeFreeCar = employeeConfigRepository.getEmployeeFreeCarDetails(companyId);
        Map<Integer, List<UserClaimDetils>> employeeClaimDetails = employeeConfigRepository.getUserClaimDetails(companyId);
        Map<Integer, List<UserCompanySalaryConfig>> employeeSalaryConfig = employeeConfigRepository.getUserCompanySalaryConfig(companyId);
        Map<Integer, List<UserCompanySalaryCode>> employeeSalaryCode = employeeConfigRepository.getUserCompanySalaryCode(companyId);
        Map<Integer, List<UserSalaryExtension>> employeeSalaryExtension = employeeConfigRepository.getUserCompanySalaryExtension(companyId);
        Map<Integer, List<EmployeePermission>> employeePermissions = employeeConfigRepository.getEmployeePermission(companyId);


        for (UserCompany userCompany : userCompanyList) {


            EmployeeConfigDTO employeeConfigDTO = new EmployeeConfigDTO();

            employeeConfigDTO.setUserCompanyId(userCompany.getUSER_COMPANY_ID());

            employeeConfigDTO.setEmployeeStartUpDetails(
                    employeeStartUpDetails.get(userCompany.getUSER_COMPANY_ID()) != null &&
                            !employeeStartUpDetails.get(userCompany.getUSER_COMPANY_ID()).isEmpty() ?
                            employeeStartUpDetails.get(userCompany.getUSER_COMPANY_ID()).getFirst() : null
            );

            employeeConfigDTO.setEmployeeStartUpSalaryCodes(
                    employeeStartUpSalaryCodes.get(userCompany.getUSER_COMPANY_ID()) != null &&
                            !employeeStartUpSalaryCodes.get(userCompany.getUSER_COMPANY_ID()).isEmpty() ?
                            employeeStartUpSalaryCodes.get(userCompany.getUSER_COMPANY_ID()) : new ArrayList<>()
            );

            employeeConfigDTO.setEmployeeSalaryAccounts(
                    employeeSalaryAccounts.get(userCompany.getUSER_COMPANY_ID()) != null &&
                            !employeeSalaryAccounts.get(userCompany.getUSER_COMPANY_ID()).isEmpty() ?
                            employeeSalaryAccounts.get(userCompany.getUSER_COMPANY_ID()).getFirst() : null
            );

            employeeConfigDTO.setEmployeeTaxDeductions(
                    employeeTaxDeductions.get(userCompany.getUSER_COMPANY_ID()) != null &&
                            !employeeTaxDeductions.get(userCompany.getUSER_COMPANY_ID()).isEmpty() ?
                            employeeTaxDeductions.get(userCompany.getUSER_COMPANY_ID()).getFirst() : null
            );

            employeeConfigDTO.setEmployeeAppointments(
                    employeeAppointments.get(userCompany.getUSER_COMPANY_ID()) != null &&
                            !employeeAppointments.get(userCompany.getUSER_COMPANY_ID()).isEmpty() ?
                            employeeAppointments.get(userCompany.getUSER_COMPANY_ID()).getFirst() : null
            );

            employeeConfigDTO.setEmployeeSchemes(
                    employeeSchemes.get(userCompany.getUSER_COMPANY_ID()) != null &&
                            !employeeSchemes.get(userCompany.getUSER_COMPANY_ID()).isEmpty() ?
                            employeeSchemes.get(userCompany.getUSER_COMPANY_ID()).getFirst() : null
            );

            employeeConfigDTO.setEmployeeWorkPlaces(
                    employeeWorkPlaces.get(userCompany.getUSER_COMPANY_ID()) != null ?
                            employeeWorkPlaces.get(userCompany.getUSER_COMPANY_ID()) : new ArrayList<>()
            );

            employeeConfigDTO.setEmployeeFreeCarDetails(
                    employeeFreeCar.get(userCompany.getUSER_COMPANY_ID()) != null &&
                            !employeeFreeCar.get(userCompany.getUSER_COMPANY_ID()).isEmpty() ?
                            employeeFreeCar.get(userCompany.getUSER_COMPANY_ID()) : new ArrayList<>()
            );

            employeeConfigDTO.setEmployeeClaimDetails(
                    employeeClaimDetails.get(userCompany.getUSER_COMPANY_ID()) != null &&
                            !employeeClaimDetails.get(userCompany.getUSER_COMPANY_ID()).isEmpty() ?
                            employeeClaimDetails.get(userCompany.getUSER_COMPANY_ID()) : new ArrayList<>()
            );

            employeeConfigDTO.setEmployeeSalaryConfig(
                    employeeSalaryConfig.get(userCompany.getUSER_COMPANY_ID()) != null &&
                            !employeeSalaryConfig.get(userCompany.getUSER_COMPANY_ID()).isEmpty() ?
                            employeeSalaryConfig.get(userCompany.getUSER_COMPANY_ID()).getFirst() : null
            );

            employeeConfigDTO.setEmployeeSalaryCode(
                    employeeSalaryCode.get(userCompany.getUSER_COMPANY_ID()) != null &&
                            !employeeSalaryCode.get(userCompany.getUSER_COMPANY_ID()).isEmpty() ?
                            employeeSalaryCode.get(userCompany.getUSER_COMPANY_ID()) : new ArrayList<>()
            );

            employeeConfigDTO.setEmployeeExtension(
                    employeeSalaryExtension.get(userCompany.getUSER_COMPANY_ID()) != null &&
                            !employeeSalaryExtension.get(userCompany.getUSER_COMPANY_ID()).isEmpty() ?
                            employeeSalaryExtension.get(userCompany.getUSER_COMPANY_ID()) : new ArrayList<>()
            );

            employeeConfigDTO.setEmployeePermissions(
                    employeePermissions.get(userCompany.getUSER_COMPANY_ID()) != null &&
                            !employeePermissions.get(userCompany.getUSER_COMPANY_ID()).isEmpty() ?
                            employeePermissions.get(userCompany.getUSER_COMPANY_ID()) : new ArrayList<>()
            );

            employeeConfigList.add(employeeConfigDTO);
        }

        System.out.println("********Employee Config Data: *********" + employeeConfigList);

        return employeeConfigList;
    }

    public List<UserCompany> getUserCompanyList(Integer companyId) {

        List<UserCompany> userCompanyList = employeeConfigRepository.getUserCompanyList(companyId);
        return userCompanyList;

    }

    public List<AppUser> getAppUserList(List<UserCompany> userCompanyList) {

        List<Integer> userIds = userCompanyList.stream()
                .map(UserCompany::getUSER_ID)
                .collect(Collectors.toList());

        List<AppUser> appUserList = employeeConfigRepository.getAppUserList(userIds);

        return appUserList;

    }
}
