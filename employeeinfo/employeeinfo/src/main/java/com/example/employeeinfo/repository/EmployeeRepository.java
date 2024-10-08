package com.example.employeeinfo.repository;

import com.example.employeeinfo.client.Fullresponse;
import com.example.employeeinfo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
    Optional<Employee> getEmployeesByccode(Long ccode);
}
