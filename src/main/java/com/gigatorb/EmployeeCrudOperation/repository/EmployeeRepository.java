package com.gigatorb.EmployeeCrudOperation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gigatorb.EmployeeCrudOperation.domain.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
 