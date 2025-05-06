package com.zirius.zerp.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.zirius.zerp.dto.AltinnCommunicationDetilsDTO;
import com.zirius.zerp.dto.CompanyConfigDTO;
import com.zirius.zerp.dto.CompanyDataDTO;
import com.zirius.zerp.dto.EmployeeConfigDTO;
import com.zirius.zerp.dto.SalaryRunDetailsDTO;
import com.zirius.zerp.dto.TaxCardDetailsDTO;
import com.zirius.zerp.model.AltinnUser;
import com.zirius.zerp.model.ClaimCollectorDetails;
import com.zirius.zerp.model.ClaimCollectorValues;
import com.zirius.zerp.model.Company;
import com.zirius.zerp.model.CompanyFreeCarBenefits;
import com.zirius.zerp.model.CompanyFreeCarDetails;
import com.zirius.zerp.model.CompanyFreeCarInsurance;
import com.zirius.zerp.model.CompanyFreeCarSetting;
import com.zirius.zerp.model.CompanyPensionOTP;
import com.zirius.zerp.model.CompanySalaryDetails;
import com.zirius.zerp.model.CompanyWorkPlace;
import com.zirius.zerp.model.CompanyWorkPlaceMunicipality;
import com.zirius.zerp.model.SalaryGroup;
import com.zirius.zerp.model.SalaryReportingCode;
import com.zirius.zerp.model.SalaryReportingCodeAmessage;
import com.zirius.zerp.model.SalaryReportingCodeBasis;
import com.zirius.zerp.model.SalaryYearlyConstant;
import com.zirius.zerp.repository.CompanyConfigRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

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
    private ObjectMapper objectMapper; // for manual JSON conversion if needed

    public CompanyConfigDTO fetchCompanyConfig(Integer companyId) {

        List<SalaryGroup> salaryGroups = companyConfigRepository.getSalaryGroups(companyId);
        List<SalaryReportingCode> salaryCodes = companyConfigRepository.getSalaryCodes(companyId);
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

        return configDTO;
    }

    public boolean fetchCompanyConfigAsJson(Integer companyId) throws Exception {
        CompanyConfigDTO dto = fetchCompanyConfig(companyId);

        String jsonString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(dto);

        String fileName = "E:\\Migration_docs\\company_config_" + companyId + ".json";

        Files.write(
                Paths.get(fileName),
                jsonString.getBytes(),
                StandardOpenOption.CREATE,
                StandardOpenOption.TRUNCATE_EXISTING
        );

        System.out.println("Saved JSON to: " + fileName);
        return true;
    }

    public boolean fetchWholeCompanyData(Integer companyId) throws Exception {

        CompanyDataDTO companyDataDTO = new CompanyDataDTO();
        Company company = companyConfigRepository.getCompanyDetails(companyId);
        companyDataDTO.setCompanyId(companyId);
        companyDataDTO.setCompanyName(company.getNAME());
        AltinnCommunicationDetilsDTO altinnCommunicationDetilsDTO = new AltinnCommunicationDetilsDTO();

        CompanyConfigDTO configDTO = fetchCompanyConfig(companyId);
        EmployeeConfigDTO employeeConfigDTO = employeeConfigService.getEmployeeConfiguration(companyId);
        altinnCommunicationDetilsDTO.setTaxCardDetailsDTO(taxCardDetailsService.getTaxCardDetailsData(companyId));
        altinnCommunicationDetilsDTO.setSalaryRunDetailsDTO(salaryRunDetailsService.getSalaryRunDetailsAndLog(companyId));

        companyDataDTO.setCompanyConfigDTO(configDTO);
        companyDataDTO.setEmployeeConfigDTO(employeeConfigDTO);
        companyDataDTO.setSalaryRunDetailsDTO(altinnCommunicationDetilsDTO);

        String jsonString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(companyDataDTO);

        String fileName = "E:\\Migration_docs\\" + companyDataDTO.getCompanyName() + "_" + companyId + ".json";

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
