package com.zirius.zerp.dto;

import lombok.Data;

@Data
public class CompanyDataDTO {

    private Integer companyId;
    private String companyName;
    private CompanyConfigDTO companyConfigDTO;
    private EmployeeConfigDTO employeeConfigDTO;
    private AltinnCommunicationDetilsDTO salaryRunDetailsDTO;

}
