package com.zirius.zerp.model.zerpapp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "work_place_municipality")
public class CompanyWorkPlaceMunicipality {

    @Id
    private Long WORK_PLACE_MUNICIPALITY_ID;

    private Integer WORK_PLACE_ID;

    private Integer YEAR;

    private Long MUNICIPALITY_ID;

    private Date CREATED_DATETIME;

    private Date MODIFIED_DATETIME;

    private Integer VERSION;

    public Long getWORK_PLACE_MUNICIPALITY_ID() {
        return WORK_PLACE_MUNICIPALITY_ID;
    }

    public void setWORK_PLACE_MUNICIPALITY_ID(Long WORK_PLACE_MUNICIPALITY_ID) {
        this.WORK_PLACE_MUNICIPALITY_ID = WORK_PLACE_MUNICIPALITY_ID;
    }

    public Integer getWORK_PLACE_ID() {
        return WORK_PLACE_ID;
    }

    public void setWORK_PLACE_ID(Integer WORK_PLACE_ID) {
        this.WORK_PLACE_ID = WORK_PLACE_ID;
    }

    public Integer getYEAR() {
        return YEAR;
    }

    public void setYEAR(Integer YEAR) {
        this.YEAR = YEAR;
    }

    public Long getMUNICIPALITY_ID() {
        return MUNICIPALITY_ID;
    }

    public void setMUNICIPALITY_ID(Long MUNICIPALITY_ID) {
        this.MUNICIPALITY_ID = MUNICIPALITY_ID;
    }

    public Date getCREATED_DATETIME() {
        return CREATED_DATETIME;
    }

    public void setCREATED_DATETIME(Date CREATED_DATETIME) {
        this.CREATED_DATETIME = CREATED_DATETIME;
    }

    public Date getMODIFIED_DATETIME() {
        return MODIFIED_DATETIME;
    }

    public void setMODIFIED_DATETIME(Date MODIFIED_DATETIME) {
        this.MODIFIED_DATETIME = MODIFIED_DATETIME;
    }

    public Integer getVERSION() {
        return VERSION;
    }

    public void setVERSION(Integer VERSION) {
        this.VERSION = VERSION;
    }
}
