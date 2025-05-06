package com.zirius.zerp.model.zerpapp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;

@Data

@Entity
@Table(name = "app_user")
public class AppUser {

    @Id
    private Integer USER_ID;
    private String NAME;
    private String LOGIN_ID;
    private String password;
    private Boolean  IS_ACTIVE;
    private Boolean  IS_BLOCKED;
    private Date BLOCKED_DATETIME;
    private Integer VERSION;
    private Date CREATED_DATETIME;
    private Date MODIFIED_DATETIME;
    private Boolean  IS_SUPPORT_USER;
    private Boolean  IS_REQUIRED_PWD_CHANGE;
    private Boolean  IS_MIGRATED;
    private String COGNITO_ID;

}
