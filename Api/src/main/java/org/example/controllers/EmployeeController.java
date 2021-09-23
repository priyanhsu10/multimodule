package org.example.controllers;

import org.example.dtos.EmployeeDto;
import org.example.services.interfaces.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    IEmployeeService iEmployeeService;
@GetMapping
    public ResponseEntity<List<EmployeeDto>> getAll(){
        return new ResponseEntity<List<EmployeeDto>>(iEmployeeService.getAll(), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Void> create(@RequestBody EmployeeDto employeeDto){
    iEmployeeService.add(employeeDto);
        return new  ResponseEntity(HttpStatus.CREATED);
    }
    @PutMapping("/:id")
    public ResponseEntity<Void> create(@PathVariable int id,@RequestBody EmployeeDto employeeDto){
    employeeDto.setId(id);
        iEmployeeService.update(employeeDto);
        return new  ResponseEntity(HttpStatus.CREATED);
    }
}
