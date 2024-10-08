package com.example.employeeinfo.feign;

import com.example.employeeinfo.client.project;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="ProjectInfo",url = "http://localhost:9091/project")
public interface ProjectClient {
    @GetMapping("/Project/{ccode}")
    List<project> getProjects(@PathVariable("ccode") Long ccode);


}
