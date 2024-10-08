package com.ust.projectInfo.controller;

import com.ust.projectInfo.dto.Projectdto;
import com.ust.projectInfo.model.Project;
import com.ust.projectInfo.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/project")
public class projectController {

    @Autowired
    private ProjectService projectService;

    @PostMapping("/addProject")
    public ResponseEntity<Project> addProject(@RequestBody Projectdto p){
        return new ResponseEntity<>(projectService.addProject(p), HttpStatus.CREATED);
    }

    @GetMapping("/Project/{ccode}")
    public ResponseEntity<List<Project>> getProjects(@PathVariable long ccode){
        return  ResponseEntity.ok(projectService.getProjectsByCcode(ccode));
    }
}
