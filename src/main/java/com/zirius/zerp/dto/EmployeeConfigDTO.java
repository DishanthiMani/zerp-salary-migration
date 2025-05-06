package com.zirius.zerp.dto;

import com.zirius.zerp.model.zerpapp.BankAccounts;
import com.zirius.zerp.model.zerpapp.EmployeeAppointments;
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
