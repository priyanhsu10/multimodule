package org.example.services.interfaces;

import org.example.domain.entities.Employee;
import org.example.dtos.EmployeeDto;
import org.example.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class EmployeeService implements  IEmployeeService {

    @Autowired
    EmployeeRepository repository;
    @Override
    public void add(EmployeeDto employee) {
        repository.save(employee.GetEmployee());
    }

    @Override
    public void update(EmployeeDto employeeDto) {
        repository.save(employeeDto.GetEmployee());
    }

    @Override
    public List<EmployeeDto> getAll() {
        return repository.findAll().stream()
                .map(x->new EmployeeDto(x))
                .collect(Collectors.toList());
    }
}
