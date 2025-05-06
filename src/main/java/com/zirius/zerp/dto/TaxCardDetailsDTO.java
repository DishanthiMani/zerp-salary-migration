package com.zirius.zerp.dto;

import com.zirius.zerp.model.AltinnSalaryTaxInfo;
import com.zirius.zerp.model.AltinnSalaryTaxInfoUsers;
import com.zirius.zerp.model.EmployeeTaxWithholdingDetails;
import com.zirius.zerp.model.SalaryEmployeeTaxDetails;
import com.zirius.zerp.model.SalaryTaxInfoLog;
import lombok.Data;

import java.util.List;

@Data
public class TaxCardDetailsDTO {

    private List<SalaryTaxInfoLog> salaryTaxInfoLogs;
    private List<AltinnSalaryTaxInfo> altinnSalaryTaxInfos;
    private List<AltinnSalaryTaxInfoUsers> altinnSalaryTaxInfoUsers;
    private List<EmployeeTaxWithholdingDetails> employeeTaxWithholdingDetails;
    private List<SalaryEmployeeTaxDetails> salaryEmployeeTaxDetails;
}
