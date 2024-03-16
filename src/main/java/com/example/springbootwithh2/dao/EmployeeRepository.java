package com.example.springbootwithh2.dao;

import com.example.springbootwithh2.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    List<Employee> findByDept(String dept);

}
