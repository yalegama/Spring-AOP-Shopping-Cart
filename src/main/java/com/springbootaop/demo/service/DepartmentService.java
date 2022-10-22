package com.springbootaop.demo.service;

import com.springbootaop.demo.entity.Department;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);

    public List<Department> fetchDepartments();
}
