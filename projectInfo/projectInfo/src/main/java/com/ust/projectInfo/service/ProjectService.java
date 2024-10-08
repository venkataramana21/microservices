package com.ust.projectInfo.service;

import com.ust.projectInfo.dto.Projectdto;
import com.ust.projectInfo.model.Project;
import com.ust.projectInfo.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {
    @Autowired
    ProjectRepository projectRepository;

    public List<Project> getProjectsByCcode(long ccode) {
        return projectRepository.findByCcode(ccode);

    }

    public Project addProject(Projectdto p) {
        Project project1 = new Project();
        project1.setProjectId(p.getProjectId());
        project1.setProjectName(p.getProjectName());
        project1.setProjectManager(p.getProjectManager());
        project1.setTeamMembers(p.getTeamMembers());
        project1.setProjectStatus(p.getProjectStatus());
        project1.setProjectStartDate(p.getProjectStartDate());
        project1.setProjectEndDate(p.getProjectEndDate());
        project1.setProjectBudget(p.getProjectBudget());
        project1.setCompanyName(p.getCompanyName());
        project1.setCcode(p.getCcode());
        return projectRepository.save(project1);

    }
}
