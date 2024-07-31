package com.hexaware.employee.repository;

import com.hexaware.employee.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {
    //@Query("select d from Department d where d.name=:name",na)
    Optional<Department> findByName(String name);
}
