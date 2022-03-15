package org.example.domain;

public class Department {

    private DepartmentType departmentName;
    private String managerCode;

    public Department(DepartmentType departmentName, String managerCode) {
        this.departmentName = departmentName;
        this.managerCode = managerCode;
    }

    public DepartmentType getDepartmentName() {
        return departmentName;
    }

    public String getManagerCode() {
        return managerCode;
    }

    @Override
    public String toString() {
        return "Project{" +
                "Department name =" + departmentName +
                ", Manager personal code ='" + managerCode + '\'' +
                '}';
    }

}
