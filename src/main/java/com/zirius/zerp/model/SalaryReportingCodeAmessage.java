package com.zirius.zerp.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "salary_reporting_code_a_message")
public class SalaryReportingCodeAmessage {

    @Id
    private Integer SALARY_REPORTING_CODE_ID;
    private Long SALARY_DESCRIPTION;
    private Long BENEFITS;
    private Boolean IS_SPECIFICATION;

    public Integer getSALARY_REPORTING_CODE_ID() {
        return SALARY_REPORTING_CODE_ID;
    }

    public void setSALARY_REPORTING_CODE_ID(Integer SALARY_REPORTING_CODE_ID) {
        this.SALARY_REPORTING_CODE_ID = SALARY_REPORTING_CODE_ID;
    }

    public Long getSALARY_DESCRIPTION() {
        return SALARY_DESCRIPTION;
    }

    public void setSALARY_DESCRIPTION(Long SALARY_DESCRIPTION) {
        this.SALARY_DESCRIPTION = SALARY_DESCRIPTION;
    }

    public Long getBENEFITS() {
        return BENEFITS;
    }

    public void setBENEFITS(Long BENEFITS) {
        this.BENEFITS = BENEFITS;
    }

    public Boolean getIS_SPECIFICATION() {
        return IS_SPECIFICATION;
    }

    public void setIS_SPECIFICATION(Boolean IS_SPECIFICATION) {
        this.IS_SPECIFICATION = IS_SPECIFICATION;
    }
}
