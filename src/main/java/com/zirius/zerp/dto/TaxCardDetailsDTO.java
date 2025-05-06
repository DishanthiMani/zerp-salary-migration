package com.zirius.zerp.dto;

import com.zirius.zerp.model.zerpapp.AltinnSalaryTaxInfo;
import com.zirius.zerp.model.zerpapp.AltinnSalaryTaxInfoUsers;
import com.zirius.zerp.model.zerpapp.EmployeeTaxWithholdingDetails;
import com.zirius.zerp.model.zerpapp.SalaryEmployeeTaxDetails;
import com.zirius.zerp.model.zerpapp.SalaryTaxInfoLog;
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
