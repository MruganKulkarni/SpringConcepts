package com.bridgelabz.springconcepts.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeBean {

    private int empId;
    private String name;

    @Autowired
    private DepartmentBean departmentBean;

    public void showEmployeeDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + name);
        System.out.println("Department: " + departmentBean.getDeptName());
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setName(String name) {
        this.name = name;
    }

}