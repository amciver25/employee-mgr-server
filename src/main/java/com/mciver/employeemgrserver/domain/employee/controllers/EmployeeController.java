package com.mciver.employeemgrserver.domain.employee.controllers;
import com.mciver.employeemgrserver.domain.employee.services.EmployeeService;
import com.mciver.employeemgrserver.domain.employee.models.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {

        private EmployeeService employeeService;

        public EmployeeController(EmployeeService employeeService) {
            this.employeeService = employeeService;
        }

        @GetMapping
        public ResponseEntity<List<Employee>> getAll(){
            List<Employee> employees = employeeService.getAll();
            return new ResponseEntity<>(employees, HttpStatus.OK);
        }

        @PostMapping
        public ResponseEntity<Employee> create(@RequestBody Employee employee){
            employee = employeeService.create(employee);
            return new ResponseEntity<>(employee, HttpStatus.CREATED);
        }

        @GetMapping("{id}")
        public ResponseEntity<Employee> getById(@PathVariable("id") Long id){
            Employee employee = employeeService.getById(id);
            return new ResponseEntity<>(employee, HttpStatus.OK);
        }

        @GetMapping("lookup")
        public ResponseEntity<Employee> getByEmail(@RequestParam String email){
            Employee employee = employeeService.getByEmail(email);
            return new ResponseEntity<>(employee, HttpStatus.OK);
        }

        @PutMapping("{id}")
        public ResponseEntity<Employee> update(@PathVariable("id") Long id, @RequestBody Employee employeeDetail){
            employeeDetail = employeeService.update(id, employeeDetail);
            return new ResponseEntity<>(employeeDetail, HttpStatus.ACCEPTED);
        }

        @DeleteMapping("{id}")
        public ResponseEntity delete(@PathVariable("id") Long id){
            employeeService.delete(id);
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
    }
