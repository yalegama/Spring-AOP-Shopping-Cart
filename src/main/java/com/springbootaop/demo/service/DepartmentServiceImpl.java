package com.springbootaop.demo.service;

import com.springbootaop.demo.entity.Department;
import com.springbootaop.demo.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService{

    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public Department saveDepartments(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> fetchDepartments() {
        return departmentRepository.findAll();
    }

    @Override
    public Department getByDepartmentId(Long departmenId) {
        return departmentRepository.findById(departmenId).get();
    }

    @Override
    public String deletingDepartments(Long departmentId) {
        departmentRepository.deleteById(departmentId);
        return "Deleted";
    }

}
