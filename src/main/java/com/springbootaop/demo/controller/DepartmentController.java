package com.springbootaop.demo.controller;

import com.springbootaop.demo.entity.Department;
import com.springbootaop.demo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

   @PostMapping("/departments")
    public Department saveDepartments(@RequestBody Department department){
       return departmentService.saveDepartments(department);
   }

   @GetMapping("/departments")
    public List<Department> fetchDepartments(){
       return departmentService.fetchDepartments();
   }

   @GetMapping("/departments/{id}")
    public Department getByDepartmentId(@PathVariable("id") Long departmenId){
       return departmentService.getByDepartmentId(departmenId);
   }

   @DeleteMapping("/departments/{id}")
    public String deletingDepartments(@PathVariable("id") Long departmentId){
       return departmentService.deletingDepartments(departmentId);
   }

}
