package com.zirius.zerp.dto;

import com.zirius.zerp.model.AltinnSalaryTaxInfo;
import com.zirius.zerp.model.SalaryTaxInfoLog;
import lombok.Data;

import java.util.List;

@Data
public class AltinnCommunicationDetilsDTO {

    private TaxCardDetailsDTO taxCardDetailsDTO;
    private SalaryRunDetailsDTO salaryRunDetailsDTO;
}
