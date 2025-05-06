package com.zirius.zerp.model.zerpapp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Table(name = "Company")
@Data
public class Company {

    @Id
    private Integer COMPANY_ID;
    private String NAME;
    private String ORG_NO;
    private Boolean  IS_ACTIVE;
    private Boolean  IS_DELETED;

}
