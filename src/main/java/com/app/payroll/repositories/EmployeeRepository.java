package com.app.payroll.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.payroll.entities.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {


}