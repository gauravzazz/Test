package com.rest.JPA;

import com.rest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestJPA extends JpaRepository<Employee, Long> {
}
