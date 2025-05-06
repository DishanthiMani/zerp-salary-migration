package com.zirius.zerp.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.zirius.zerp.dto.EmployeeConfigDTO;
import com.zirius.zerp.model.BankAccounts;
import com.zirius.zerp.model.EmployeeAppointments;
import com.zirius.zerp.model.EmployeeSalaryAccounts;
import com.zirius.zerp.model.EmployeeScheme;
import com.zirius.zerp.model.EmployeeStartUpDetails;
import com.zirius.zerp.model.EmployeeStartUpSalaryCode;
import com.zirius.zerp.model.EmployeeTaxDeduction;
import com.zirius.zerp.model.EmployeeWorkPlace;
import com.zirius.zerp.model.UserClaimDetils;
import com.zirius.zerp.model.UserCompany;
import com.zirius.zerp.model.UserCompanySalaryCode;
import com.zirius.zerp.model.UserCompanySalaryConfig;
import com.zirius.zerp.model.UserFreeCarDetails;
import com.zirius.zerp.model.UserSalaryExtension;
import com.zirius.zerp.repository.EmployeeConfigRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeConfigService {

    @Autowired
    private EmployeeConfigRepository employeeConfigRepository;


    public EmployeeConfigDTO getEmployeeConfiguration(Integer companyId) {

        EmployeeConfigDTO employeeConfigDTO = new EmployeeConfigDTO();

        List<UserCompany> userCompanyList = employeeConfigRepository.getUserCompanyList(companyId);
        List<EmployeeSalaryAccounts> employeeSalaryAccounts = employeeConfigRepository.getEmployeeSalaryAccount(companyId);
        List<BankAccounts> bankAccounts = employeeConfigRepository.getBankAccounts(companyId);
        List<EmployeeTaxDeduction> employeeTaxDeductions = employeeConfigRepository.getEmployeeTaxDeduction(companyId);
        List<EmployeeAppointments> employeeAppointments = employeeConfigRepository.getEmployeeAppointments(companyId);
        List<EmployeeScheme> employeeSchemes = employeeConfigRepository.getEmployeeScheme(companyId);
        List<EmployeeStartUpDetails> employeeStartUpDetails = employeeConfigRepository.getEmployeeStartUpDetails(companyId);
        List<EmployeeStartUpSalaryCode> employeeStartUpSalaryCodes = employeeConfigRepository.getEmployeeStartUpCodes(companyId);
        List<EmployeeWorkPlace> employeeWorkPlaces = employeeConfigRepository.getEmployeeWorkPlaceList(companyId);
        List<UserFreeCarDetails> employeeFreeCar = employeeConfigRepository.getEmployeeFreeCarDetails(companyId);
        List<UserClaimDetils> employeeClaimDetails = employeeConfigRepository.getUserClaimDetails(companyId);
        List<UserCompanySalaryConfig> employeeSalaryConfig = employeeConfigRepository.getUserCompanySalaryConfig(companyId);
        List<UserCompanySalaryCode> employeeSalaryCode = employeeConfigRepository.getUserCompanySalaryCode(companyId);
        List<UserSalaryExtension> employeeSalaryExtension = employeeConfigRepository.getUserCompanySalaryExtension(companyId);


        employeeConfigDTO.setUserCompanyList(userCompanyList);
        employeeConfigDTO.setEmployeeStartUpDetails(employeeStartUpDetails);
        employeeConfigDTO.setEmployeeStartUpSalaryCodes(employeeStartUpSalaryCodes);
        employeeConfigDTO.setEmployeeSalaryAccounts(employeeSalaryAccounts);
        employeeConfigDTO.setBankAccounts(bankAccounts);
        employeeConfigDTO.setEmployeeTaxDeductions(employeeTaxDeductions);
        employeeConfigDTO.setEmployeeAppointments(employeeAppointments);
        employeeConfigDTO.setEmployeeSchemes(employeeSchemes);
        employeeConfigDTO.setEmployeeWorkPlaces(employeeWorkPlaces);
        employeeConfigDTO.setEmployeeFreeCarDetails(employeeFreeCar);
        employeeConfigDTO.setEmployeeClaimDetails(employeeClaimDetails);
        employeeConfigDTO.setEmployeeSalaryConfig(employeeSalaryConfig);
        employeeConfigDTO.setEmployeeSalaryCode(employeeSalaryCode);
        employeeConfigDTO.setEmployeeExtension(employeeSalaryExtension);

        return employeeConfigDTO;
    }
}
