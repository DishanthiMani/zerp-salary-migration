package com.zirius.zerp.model.zerpapp;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "altinn_reference_info")
public class AltinnReferenceInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ALTINN_REFERENCE_INFO_ID;

    private Integer SALARY_RUN_ID;

    private Integer ALTINN_REFERENCE_TYPE_ID;

    private String ALTINN_REFERENCE_VALUE;

    private Date MODIFIED_DATETIME;

    private Integer SALARY_REPORT_ID;

    private Integer SALARY_TAXINFO_ID;
}
