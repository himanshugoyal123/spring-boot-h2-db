package com.example.springbootwithh2.controller;

import com.example.springbootwithh2.dao.EmployeeRepository;
import com.example.springbootwithh2.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository repository;

    @GetMapping("/getEmployees")
    public List<Employee> getAll() {
        return repository.findAll();
    }

    @GetMapping("/getEmployee/{dept}")
    public List<Employee> getEmployee(@PathVariable String dept) {
        return repository.findByDept(dept);
    }

    @PostMapping("/saveEmployee")
    public String saveEmployee(@RequestBody Employee employee) {
        repository.save(employee);
        return "Employee saved";
    }

    @PutMapping("/updateEmployee")
    public String updateEmployee(@RequestBody Employee employee) {
        repository.save(employee);
        return "Employee saved";
    }

    @DeleteMapping("/removeEmployee/{id}")
    public String updateEmployee(@PathVariable int id) {
        Optional<Employee> e = repository.findById(id);
        if (e.isPresent()) {
            repository.delete(e.get());
            return "Employee removed";
        }
        return "Employee not present";
    }

}
