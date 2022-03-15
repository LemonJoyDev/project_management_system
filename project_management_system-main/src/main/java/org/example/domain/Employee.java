package org.example.domain;

import java.time.LocalDate;

public class Employee {
    private String id;
    private String name;
    private String lastName;
    private LocalDate startedAt;
    private LocalDate birthDate;
    private OccupationType occupation;
    private DepartmentType departmentName;
    private Integer projectId;

    public Employee(String id, String name, String lastName, LocalDate startedAt, LocalDate birthDate,
                    OccupationType occupation, DepartmentType departmentName, Integer projectId) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.startedAt = startedAt;
        this.birthDate = birthDate;
        this.occupation = occupation;
        this.departmentName = departmentName;
        this.projectId = projectId;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getProjectId() {
        return projectId;
    }

    @Override
    public String toString() {
        return "Employee{" +
            "id='" + id + '\'' +
            ", name='" + name + '\'' +
            ", lastName='" + lastName + '\'' +
            ", startedAt=" + startedAt +
            ", birthDate=" + birthDate +
            ", occupation=" + occupation +
            ", department=" + departmentName +
            ", projectId=" + projectId +
            '}';
    }
}
