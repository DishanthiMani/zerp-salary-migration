package com.zirius.zerp.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "altinn_salary_run_work_relationship")
public class AltinnSalaryRunWorkRelationship {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ALTINN_SALARY_RUN_WORK_RELATIONSHIP_ID;

    private Integer ALTINN_SALARY_RUN_ID;

    private Integer USER_COMPANY_ID;

    private String user_ssn;

    private String international_id;

    private Integer WORK_PLACE_ID;

    private String ARBEIDSFORHOLDID;

    private String TYPEARBEIDSFORHOLD;

    private Date STARTDATO;

    private Date SLUTTDATO;

    private String ANTALLTIMERPERUKESOMENFULLSTILLINGTILSVARER;

    private String YRKE;

    private String ARBEIDSTIDSORDNING;

    private String STILLINGSPROSENT;

    private Date SISTELOENNSENDRINGSDATO;

    private Date SISTEDATOFORSTILLINGSPROSENTENDRING;

    private Integer VERSION;

    private Date CREATED_DATETIME;

    private Date MODIFIED_DATETIME;

    private String AARSAKTILSLUTTDATO;

    private String FORMFORANSETTELSE;

    private String SHIP_REGISTER;

    private String VESSEL_TYPE;

    private String SHIPPING_AREA;
}
