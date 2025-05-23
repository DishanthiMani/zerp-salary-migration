package com.zirius.zerp.dto;

import com.zirius.zerp.model.zerpapp.AltinnUser;
import com.zirius.zerp.model.zerpapp.ClaimCollectorDetails;
import com.zirius.zerp.model.zerpapp.ClaimCollectorValues;
import com.zirius.zerp.model.zerpapp.CompanyFreeCarBenefits;
import com.zirius.zerp.model.zerpapp.CompanyFreeCarDetails;
import com.zirius.zerp.model.zerpapp.CompanyFreeCarInsurance;
import com.zirius.zerp.model.zerpapp.CompanyFreeCarSetting;
import com.zirius.zerp.model.zerpapp.CompanyPensionOTP;
import com.zirius.zerp.model.zerpapp.CompanySalaryDetails;
import com.zirius.zerp.model.zerpapp.CompanyWorkPlace;
import com.zirius.zerp.model.zerpapp.CompanyWorkPlaceMunicipality;
import com.zirius.zerp.model.zerpapp.SalaryGroup;
import com.zirius.zerp.model.zerpapp.SalaryReportingCode;
import com.zirius.zerp.model.zerpapp.SalaryReportingCodeAmessage;
import com.zirius.zerp.model.zerpapp.SalaryReportingCodeBasis;
import com.zirius.zerp.model.zerpapp.SalaryYearlyConstant;

import java.util.List;

public class CompanyConfigDTO {
    private List<SalaryGroup> salaryGroups;
    private List<SalaryReportingCodeDetailsDTO> salaryCodeDetails;
    private List<SalaryReportingCode> salaryCodes;
    private List<SalaryReportingCodeAmessage> salaryReportingCodeAmessages;
    private List<SalaryReportingCodeBasis> salaryReportingCodeBases;
    private List<SalaryYearlyConstant> yearlyConstants;
    private CompanySalaryDetails companySalaryDetails;
    private List<CompanyFreeCarDetails> companyFreeCarDetails;
    private List<CompanyFreeCarBenefits> companyFreeCarBenefits;
    private List<CompanyFreeCarInsurance> companyFreeCarInsurances;
    private List<CompanyFreeCarSetting> companyFreeCarSettings;
    private List<AltinnUser> altinnUsers;
    private List<CompanyPensionOTP> companyPensionOTPS;
    private List<ClaimCollectorValues> claimCollectorValues;
    private List<ClaimCollectorDetails> claimCollectorDetails;
    private List<CompanyWorkPlace> companyWorkPlaces;
    private List<CompanyWorkPlaceMunicipality> workPlaceMunicipalities;

    public List<SalaryGroup> getSalaryGroups() {
        return salaryGroups;
    }

    public void setSalaryGroups(List<SalaryGroup> salaryGroups) {
        this.salaryGroups = salaryGroups;
    }

    public List<SalaryReportingCodeDetailsDTO> getSalaryCodeDetails() {
        return salaryCodeDetails;
    }

    public void setSalaryCodeDetails(List<SalaryReportingCodeDetailsDTO> salaryCodeDetails) {
        this.salaryCodeDetails = salaryCodeDetails;
    }

    public List<SalaryReportingCode> getSalaryCodes() {
        return salaryCodes;
    }

    public void setSalaryCodes(List<SalaryReportingCode> salaryCodes) {
        this.salaryCodes = salaryCodes;
    }

    public List<SalaryYearlyConstant> getYearlyConstants() {
        return yearlyConstants;
    }

    public void setYearlyConstants(List<SalaryYearlyConstant> yearlyConstants) {
        this.yearlyConstants = yearlyConstants;
    }

    public List<SalaryReportingCodeAmessage> getSalaryReportingCodeAmessages() {
        return salaryReportingCodeAmessages;
    }

    public void setSalaryReportingCodeAmessages(List<SalaryReportingCodeAmessage> salaryReportingCodeAmessages) {
        this.salaryReportingCodeAmessages = salaryReportingCodeAmessages;
    }

    public List<SalaryReportingCodeBasis> getSalaryReportingCodeBases() {
        return salaryReportingCodeBases;
    }

    public void setSalaryReportingCodeBases(List<SalaryReportingCodeBasis> salaryReportingCodeBases) {
        this.salaryReportingCodeBases = salaryReportingCodeBases;
    }

    public CompanySalaryDetails getCompanySalaryDetails() {
        return companySalaryDetails;
    }

    public void setCompanySalaryDetails(CompanySalaryDetails companySalaryDetails) {
        this.companySalaryDetails = companySalaryDetails;
    }

    public List<CompanyFreeCarDetails> getCompanyFreeCarDetails() {
        return companyFreeCarDetails;
    }

    public void setCompanyFreeCarDetails(List<CompanyFreeCarDetails> companyFreeCarDetails) {
        this.companyFreeCarDetails = companyFreeCarDetails;
    }

    public List<CompanyFreeCarBenefits> getCompanyFreeCarBenefits() {
        return companyFreeCarBenefits;
    }

    public void setCompanyFreeCarBenefits(List<CompanyFreeCarBenefits> companyFreeCarBenefits) {
        this.companyFreeCarBenefits = companyFreeCarBenefits;
    }

    public List<CompanyFreeCarInsurance> getCompanyFreeCarInsurances() {
        return companyFreeCarInsurances;
    }

    public void setCompanyFreeCarInsurances(List<CompanyFreeCarInsurance> companyFreeCarInsurances) {
        this.companyFreeCarInsurances = companyFreeCarInsurances;
    }

    public List<CompanyFreeCarSetting> getCompanyFreeCarSettings() {
        return companyFreeCarSettings;
    }

    public void setCompanyFreeCarSettings(List<CompanyFreeCarSetting> companyFreeCarSettings) {
        this.companyFreeCarSettings = companyFreeCarSettings;
    }

    public List<AltinnUser> getAltinnUsers() {
        return altinnUsers;
    }

    public void setAltinnUsers(List<AltinnUser> altinnUsers) {
        this.altinnUsers = altinnUsers;
    }

    public List<CompanyPensionOTP> getCompanyPensionOTPS() {
        return companyPensionOTPS;
    }

    public void setCompanyPensionOTPS(List<CompanyPensionOTP> companyPensionOTPS) {
        this.companyPensionOTPS = companyPensionOTPS;
    }

    public List<ClaimCollectorValues> getClaimCollectorValues() {
        return claimCollectorValues;
    }

    public void setClaimCollectorValues(List<ClaimCollectorValues> claimCollectorValues) {
        this.claimCollectorValues = claimCollectorValues;
    }

    public List<ClaimCollectorDetails> getClaimCollectorDetails() {
        return claimCollectorDetails;
    }

    public void setClaimCollectorDetails(List<ClaimCollectorDetails> claimCollectorDetails) {
        this.claimCollectorDetails = claimCollectorDetails;
    }

    public List<CompanyWorkPlace> getCompanyWorkPlaces() {
        return companyWorkPlaces;
    }

    public void setCompanyWorkPlaces(List<CompanyWorkPlace> companyWorkPlaces) {
        this.companyWorkPlaces = companyWorkPlaces;
    }

    public List<CompanyWorkPlaceMunicipality> getWorkPlaceMunicipalities() {
        return workPlaceMunicipalities;
    }

    public void setWorkPlaceMunicipalities(List<CompanyWorkPlaceMunicipality> workPlaceMunicipalities) {
        this.workPlaceMunicipalities = workPlaceMunicipalities;
    }
}
