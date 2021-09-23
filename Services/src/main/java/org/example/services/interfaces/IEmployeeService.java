package org.example.services.interfaces;

import org.example.domain.entities.Employee;
import org.example.dtos.EmployeeDto;

import java.util.List;

public interface IEmployeeService {
    void add(EmployeeDto employee);
   void update(EmployeeDto employeeDto);
    List<EmployeeDto> getAll();


}
