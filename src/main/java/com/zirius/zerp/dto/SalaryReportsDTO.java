package com.zirius.zerp.dto;

import com.zirius.zerp.model.zerpapp.AltinnSalaryReport;
import com.zirius.zerp.model.zerpapp.SalaryReportLog;
import lombok.Data;


@Data
public class SalaryReportsDTO {

    private SalaryReportLog salaryReportLogs;
    private AltinnSalaryReport altinnSalaryReports;

}
