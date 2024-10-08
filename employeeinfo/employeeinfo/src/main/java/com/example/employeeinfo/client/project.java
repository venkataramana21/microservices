package com.example.employeeinfo.client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class project {
    private long projectId;
    private String projectName;
    private String projectDescription;
    private String projectStatus;
    private String projectManager;
    private String projectStartDate;
    private String projectEndDate;
    private String projectBudget;
    private String companyName;
    private long ccode;

}
