package com.zirius.zerp.dto;

import com.zirius.zerp.model.BankAccounts;
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
import lombok.Data;

import java.util.List;

@Data
public class EmployeeConfigDTO {

    private List<UserCompany> userCompanyList;
    private List<EmployeeStartUpDetails> employeeStartUpDetails;
    private List<EmployeeStartUpSalaryCode> employeeStartUpSalaryCodes;
    private List<EmployeeSalaryAccounts> employeeSalaryAccounts;
    private List<BankAccounts> bankAccounts;
    private List<EmployeeTaxDeduction> employeeTaxDeductions;
    private List<EmployeeAppointments> employeeAppointments;
    private List<EmployeeScheme> employeeSchemes;
    private List<EmployeeWorkPlace> employeeWorkPlaces;
    private List<EmployeeWorkerIdDetails> employeeWorkerIdDetails;
    private List<UserFreeCarDetails> employeeFreeCarDetails;
    private List<UserClaimDetils> employeeClaimDetails;
    private List<UserCompanySalaryConfig> employeeSalaryConfig;
    private List<UserCompanySalaryCode> employeeSalaryCode;
    private List<UserSalaryExtension> employeeExtension;

}
