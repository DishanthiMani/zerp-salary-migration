package com.zirius.zerp.service;

import com.zirius.zerp.dto.TaxCardDetailsDTO;
import com.zirius.zerp.repository.zerpRepo.AltinnCommunicationDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaxCardDetailsService {

    @Autowired
    private AltinnCommunicationDetailsRepository repository;

    public TaxCardDetailsDTO getTaxCardDetailsData(Integer companyId) {

        TaxCardDetailsDTO taxCardDetailsDTO = new TaxCardDetailsDTO();
        taxCardDetailsDTO.setSalaryTaxInfoLogs(repository.getSalaryTaxInfoLog(companyId));
        taxCardDetailsDTO.setAltinnSalaryTaxInfos(repository.getAltinnSalaryTaxInfo(companyId));
        taxCardDetailsDTO.setAltinnSalaryTaxInfoUsers(repository.getAltinnSalaryTaxInfoUsers(companyId));
        taxCardDetailsDTO.setEmployeeTaxWithholdingDetails(repository.getEmployeeWithholdingDetails(companyId));
        taxCardDetailsDTO.setSalaryEmployeeTaxDetails(repository.getSalaryEmployeeTaxDetails(companyId));
        return taxCardDetailsDTO;
    }
}
