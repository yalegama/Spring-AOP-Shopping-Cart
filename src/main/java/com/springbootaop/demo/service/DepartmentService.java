package com.springbootaop.demo.service;

import com.springbootaop.demo.entity.Department;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartments(Department department);

    public List<Department> fetchDepartments();

    public Department getByDepartmentId(Long departmenId);

    public String deletingDepartments(Long departmentId);

}
