package com.zirius.zerp.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.zirius.zerp.dto.AltinnCommunicationDetilsDTO;
import com.zirius.zerp.dto.CompanyConfigDTO;
import com.zirius.zerp.dto.CompanyDataDTO;
import com.zirius.zerp.dto.EmployeeConfigDTO;
import com.zirius.zerp.dto.SalaryReportingCodeDetailsDTO;
import com.zirius.zerp.model.zerpapp.AltinnUser;
import com.zirius.zerp.model.zerpapp.AppUser;
import com.zirius.zerp.model.zerpapp.ClaimCollectorDetails;
import com.zirius.zerp.model.zerpapp.ClaimCollectorValues;
import com.zirius.zerp.model.zerpapp.Company;
import com.zirius.zerp.model.zerpapp.CompanyFreeCarBenefits;
import com.zirius.zerp.model.zerpapp.CompanyFreeCarDetails;
import com.zirius.zerp.model.zerpapp.CompanyFreeCarInsurance;
import com.zirius.zerp.model.zerpapp.CompanyFreeCarSetting;
import com.zirius.zerp.model.zerpapp.CompanyPensionOTP;
import com.zirius.zerp.model.zerpapp.CompanySalaryDetails;
import com.zirius.zerp.model.zerpapp.CompanyWorkPlace;
import com.zirius.zerp.model.zerpapp.CompanyWorkPlaceMunicipality;
import com.zirius.zerp.model.zerpapp.Department;
import com.zirius.zerp.model.zerpapp.LedgerAccount;
import com.zirius.zerp.model.zerpapp.SalaryGroup;
import com.zirius.zerp.model.zerpapp.SalaryReportingCode;
import com.zirius.zerp.model.zerpapp.SalaryReportingCodeAmessage;
import com.zirius.zerp.model.zerpapp.SalaryReportingCodeBasis;
import com.zirius.zerp.model.zerpapp.SalaryYearlyConstant;
import com.zirius.zerp.model.zerpapp.UserCompany;
import com.zirius.zerp.repository.zerpRepo.CompanyConfigRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CompanyConfigService {

    @Autowired
    private CompanyConfigRepository companyConfigRepository;

    @Autowired
    private EmployeeConfigService employeeConfigService;

    @Autowired
    private TaxCardDetailsService taxCardDetailsService;

    @Autowired
    private SalaryRunDetailsService salaryRunDetailsService;


    @Autowired
    private ObjectMapper objectMapper;

    public CompanyConfigDTO fetchCompanyConfig(Integer companyId) {

        List<SalaryGroup> salaryGroups = companyConfigRepository.getSalaryGroups(companyId);
        List<SalaryReportingCode> salaryCodes = companyConfigRepository.getSalaryCodes(companyId);
        updateLedgerAccountDetails(salaryCodes);
        List<SalaryYearlyConstant> yearlyConstants = companyConfigRepository.getYearlyConstants(companyId);
        List<CompanyWorkPlace> companyWorkPlaces = companyConfigRepository.getCompanyWorkPlace(companyId);
        List<CompanyWorkPlaceMunicipality> companyWorkPlaceMunicipalities = companyConfigRepository.getCompanyWorkPlaceMunicipality(companyId);
        List<CompanyPensionOTP> companyPensionOTPS = companyConfigRepository.getCompanyPensionOtp(companyId);
        List<CompanyFreeCarDetails> companyFreeCarDetails = companyConfigRepository.getCompanyFreeCarDetails(companyId);
        List<CompanyFreeCarInsurance> companyFreeCarInsurances = companyConfigRepository.getCompanyFreeCarInsurance(companyId);
        List<CompanyFreeCarBenefits> companyFreeCarBenefits = companyConfigRepository.getCompanyFreeCarBenefits(companyId);
        List<CompanyFreeCarSetting> companyFreeCarSettings = companyConfigRepository.getCompanyFreeCarSetting(companyId);
        CompanySalaryDetails companySalaryDetails = companyConfigRepository.getCompanySalaryDetails(companyId);
        List<AltinnUser> altinnUsers = companyConfigRepository.getCompanyAltinnUser(companyId);
        List<SalaryReportingCodeAmessage> salaryReportingCodeAmessages = companyConfigRepository.getSalaryCodeAMessage(companyId);
        List<SalaryReportingCodeBasis> salaryReportingCodeBases = companyConfigRepository.getSalaryCodeBasis(companyId);
        List<ClaimCollectorDetails> claimCollectorDetails = companyConfigRepository.getClaimCollectorDetails(companyId);
        List<ClaimCollectorValues> claimCollectorValues = companyConfigRepository.getClaimCollectorValues(companyId);
        List<Department> departments = companyConfigRepository.getDepartmentList(companyId);

        CompanyConfigDTO configDTO = new CompanyConfigDTO();
        configDTO.setSalaryGroups(salaryGroups);
        configDTO.setSalaryCodes(salaryCodes);
        configDTO.setSalaryReportingCodeBases(salaryReportingCodeBases);
        configDTO.setSalaryReportingCodeAmessages(salaryReportingCodeAmessages);
        configDTO.setCompanyWorkPlaces(companyWorkPlaces);
        configDTO.setWorkPlaceMunicipalities(companyWorkPlaceMunicipalities);
        configDTO.setCompanySalaryDetails(companySalaryDetails);
        configDTO.setCompanyFreeCarDetails(companyFreeCarDetails);
        configDTO.setCompanyFreeCarBenefits(companyFreeCarBenefits);
        configDTO.setCompanyFreeCarInsurances(companyFreeCarInsurances);
        configDTO.setCompanyFreeCarSettings(companyFreeCarSettings);
        configDTO.setClaimCollectorDetails(claimCollectorDetails);
        configDTO.setClaimCollectorValues(claimCollectorValues);
        configDTO.setCompanyPensionOTPS(companyPensionOTPS);
        configDTO.setAltinnUsers(altinnUsers);
        configDTO.setYearlyConstants(yearlyConstants);
        configDTO.setDepartmentList(departments);

        return configDTO;
    }

    public void updateLedgerAccountDetails(List<SalaryReportingCode> salaryCodeList) {

        List<LedgerAccount> ledgerList = companyConfigRepository.getLedgerAccountList();
        Map<Integer, Integer> accountIdToAccountNoMap = ledgerList.stream()
                .collect(Collectors.toMap(LedgerAccount::getACCOUNT_ID, LedgerAccount::getACCOUNT_NO));

        salaryCodeList.forEach(salaryCode -> {
            Integer accountId = Optional.ofNullable(salaryCode.getAccountId()).map(Long::intValue).orElse(null);
            Integer creditAccountId = Optional.ofNullable(salaryCode.getCreditAccountId()).map(Long::intValue).orElse(null);

            if (accountId != null && accountIdToAccountNoMap.containsKey(accountId)) {
                salaryCode.setAccountId(accountIdToAccountNoMap.get(accountId).longValue());
            }

            if (creditAccountId != null && accountIdToAccountNoMap.containsKey(creditAccountId)) {
                salaryCode.setCreditAccountId(accountIdToAccountNoMap.get(creditAccountId).longValue());
            }
        });

    }

    public boolean fetchCompanyConfigAsJson(Integer companyId, Integer plussCompanyId) throws Exception {
        CompanyConfigDTO dto = fetchCompanyConfig(companyId);

        String jsonString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(dto);

        String fileName = "E:\\Migration_docs\\company_config_" + plussCompanyId + ".json";

        Files.write(
                Paths.get(fileName),
                jsonString.getBytes(),
                StandardOpenOption.CREATE,
                StandardOpenOption.TRUNCATE_EXISTING
        );

        System.out.println("Saved JSON to: " + fileName);
        return true;
    }

    public boolean fetchWholeCompanyData(Integer companyId, Integer ziriusPlussCompanyId) throws Exception {

        CompanyDataDTO companyDataDTO = new CompanyDataDTO();
        Company company = companyConfigRepository.getCompanyDetails(companyId);
        companyDataDTO.setOrganizationNumber(company.getORG_NO());
        companyDataDTO.setCompanyId(companyId);
        companyDataDTO.setCompanyName(company.getNAME());
        AltinnCommunicationDetilsDTO altinnCommunicationDetilsDTO = new AltinnCommunicationDetilsDTO();

        CompanyConfigDTO configDTO = fetchCompanyConfig(companyId);
        List<UserCompany> userCompanyList = employeeConfigService.getUserCompanyList(companyId);
        List<AppUser> appUserList = employeeConfigService.getAppUserList(userCompanyList);
        List<EmployeeConfigDTO> employeeConfigDTO = employeeConfigService.getEmployeeConfiguration(companyId, userCompanyList);
        altinnCommunicationDetilsDTO.setTaxCardDetailsDTO(taxCardDetailsService.getTaxCardDetailsData(companyId));
        altinnCommunicationDetilsDTO.setSalaryRunDetailsDTO(salaryRunDetailsService.getSalaryRunDetailsAndLog(companyId));

        companyDataDTO.setCompanyConfigDTO(configDTO);
        companyDataDTO.setUserCompanyList(userCompanyList);
        companyDataDTO.setAppUsers(appUserList);
        companyDataDTO.setEmployeeConfigDTOList(employeeConfigDTO);
        companyDataDTO.setSalaryRunDetailsDTO(altinnCommunicationDetilsDTO);

        String jsonString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(companyDataDTO);

        String fileName = "E:\\Migration_docs\\" + ziriusPlussCompanyId + ".json";

        Files.write(
                Paths.get(fileName),
                jsonString.getBytes(),
                StandardOpenOption.CREATE,
                StandardOpenOption.TRUNCATE_EXISTING
        );

        System.out.println("Saved JSON to: " + fileName);
        return true;
    }
}
