package com.bridgelabz.springconcepts;

import com.bridgelabz.springconcepts.component.EmployeeBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringconceptsApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(SpringconceptsApplication.class, args);

        EmployeeBean employeeBean = context.getBean(EmployeeBean.class);

        employeeBean.setEmpId(101);
        employeeBean.setName("Mrugan Kulkarni");

        employeeBean.showEmployeeDetails();
    }

}