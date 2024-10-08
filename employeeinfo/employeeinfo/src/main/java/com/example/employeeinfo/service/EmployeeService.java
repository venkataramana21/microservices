package com.example.employeeinfo.service;

import com.example.employeeinfo.client.Fullresponse;
import com.example.employeeinfo.client.project;
import com.example.employeeinfo.feign.ProjectClient;
import com.example.employeeinfo.model.Employee;
import com.example.employeeinfo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private ProjectClient client;
    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Fullresponse getEmployeesByccode(Long ccode) {
//        return null;
        Employee employee =employeeRepository.getEmployeesByccode(ccode).orElse(null);
        List<project> list=client.getProjects(ccode);
        Fullresponse response = new Fullresponse();
        response.setName(employee.getName());
        response.setDepartment(employee.getDepartment());
        response.setDesignation(employee.getDesignation());
        response.setCcode(employee.getCcode());
        response.setEmail(employee.getEmail());
        response.setPhone(employee.getPhone());
        response.setAddress(employee.getAddress());
        response.setCity(employee.getCity());
        response.setState(employee.getState());
        response.setExp(employee.getExp());
        response.setDoj(employee.getDoj());
        response.setSkills(employee.getSkills());
        response.setProjects(list);
        return response;

    }
}
