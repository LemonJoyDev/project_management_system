package org.example.service;


import org.example.repository.DepartmentRepository;

import org.example.domain.Department;
import org.example.repository.DepartmentRepository;

import java.util.List;

public class DepartmentService {

    public List<Department> getAllDepartments() {
        DepartmentRepository departmentRepository = new DepartmentRepository();
        return departmentRepository.findAll();
    }

}
