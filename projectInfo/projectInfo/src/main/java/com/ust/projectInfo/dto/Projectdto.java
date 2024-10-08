package com.ust.projectInfo.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Projectdto {

    private long projectId;
    @NotNull(message = "Project name cannot be null")
    private String projectName;
    @NotNull(message = "Project description cannot be null")
    private String projectDescription;
    @NotBlank(message = "Project manager cannot be blank")
    private String projectManager;
    @NotNull(message = "Team members cannot be null")
    private String teamMembers;
    @NotNull(message = "Project status cannot be null")
    private String projectStatus;
    @NotNull(message = "Project start date cannot be null")
    private String projectStartDate;
        @NotNull(message = "Project end date cannot be null")
    private String projectEndDate;
        @NotNull(message = "Project budget cannot be null")
    private double projectBudget;

    @NotBlank(message = "Company name cannot be blank")
    private String companyName;
    private Long ccode;
}
