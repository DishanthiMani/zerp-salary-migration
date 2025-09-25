package com.zirius.zerp.dto;

import com.zirius.zerp.model.zerpapp.AppUser;
import com.zirius.zerp.model.zerpapp.UserCompany;
import lombok.Data;

import java.util.List;

@Data
public class CompanyDataDTO {

    private Integer companyId;
    private String companyName;
    private String organizationNumber;
    private CompanyConfigDTO companyConfigDTO;
    private List<AppUser> appUsers;
    private List<UserCompany> userCompanyList;
    private List<EmployeeConfigDTO> employeeConfigDTOList;
    private AltinnCommunicationDetilsDTO salaryRunDetailsDTO;
    private List<SalaryReportsDTO> salaryReportsDTO;

}
