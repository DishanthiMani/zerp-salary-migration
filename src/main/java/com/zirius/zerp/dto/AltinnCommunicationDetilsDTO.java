package com.zirius.zerp.dto;

import lombok.Data;

import java.util.List;

@Data
public class AltinnCommunicationDetilsDTO {

    private TaxCardDetailsDTO taxCardDetailsDTO;
    private List<SalaryRunDetailsDTO> salaryRunDetailsDTO;

}
