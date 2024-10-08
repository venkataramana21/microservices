package com.example.employeeinfo.controller;

import com.example.employeeinfo.client.Fullresponse;
import com.example.employeeinfo.model.Employee;
import com.example.employeeinfo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ustemps")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }

    @GetMapping("/withprojects/{ccode}")
    public ResponseEntity<Fullresponse> getEmployeesByCcodes(@PathVariable long ccode) {
        Fullresponse fullresponse = employeeService.getEmployeesByccode(ccode);
        return ResponseEntity.ok(fullresponse);
    }
}
