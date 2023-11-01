package com.mssql.mssql00.model;

public class Employee {

    private String empName;
    private String empEmail;

    @Override
    public String toString() {
        return "Employee [empName=" + empName + ", empEmail=" + empEmail + "]";
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

        public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }




}
