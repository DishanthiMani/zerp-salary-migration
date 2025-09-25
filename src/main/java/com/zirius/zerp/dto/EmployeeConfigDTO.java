package com.zirius.zerp.dto;

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
import lombok.Data;

import java.util.List;

@Data
public class EmployeeConfigDTO {

    private Integer userCompanyId;
    private EmployeeStartUpDetails employeeStartUpDetails;
    private List<EmployeeStartUpSalaryCode> employeeStartUpSalaryCodes;
    private EmployeeSalaryAccounts employeeSalaryAccounts;
//    private List<BankAccounts> bankAccounts;
    private EmployeeTaxDeduction employeeTaxDeductions;
    private EmployeeAppointments employeeAppointments;
    private EmployeeScheme employeeSchemes;
    private List<EmployeeWorkPlace> employeeWorkPlaces;
    private EmployeeWorkerIdDetails employeeWorkerIdDetails;
    private List<UserFreeCarDetails> employeeFreeCarDetails;
    private List<UserClaimDetils> employeeClaimDetails;
    private UserCompanySalaryConfig employeeSalaryConfig;
    private List<UserCompanySalaryCode> employeeSalaryCode;
    private List<UserSalaryExtension> employeeExtension;
    private List<EmployeePermission> employeePermissions;

}
