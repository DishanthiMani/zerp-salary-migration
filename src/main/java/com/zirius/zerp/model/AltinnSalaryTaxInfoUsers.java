package com.zirius.zerp.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "altinn_salary_taxinfo_users")
public class AltinnSalaryTaxInfoUsers {

    @Id
    private Integer ALTINN_SALARY_TAXINFO_USERS_ID;
    private Integer SALARY_TAXINFO_LOG_ID;
    private String user_ssn;
    private Integer USER_COMPANY_ID;

}
