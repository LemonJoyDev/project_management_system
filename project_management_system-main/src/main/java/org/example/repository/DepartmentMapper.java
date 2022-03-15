package org.example.repository;

import org.example.domain.Department;
import org.example.domain.DepartmentType;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DepartmentMapper {

    public Department fromResultSet(ResultSet resultSet) throws SQLException {
        return new Department(
                toDepartment(resultSet.getString("pavadinimas")),
                resultSet.getString("vadovas_asmenskodas"));
    }

    private DepartmentType toDepartment(String department) {
        if (department == null) {
            return null;
        }

        switch (department) {
            case "Testavimo" -> {
                return DepartmentType.QA;
            }
            case "Java" -> {
                return DepartmentType.JAVA;
            }
            case "C#" -> {
                return DepartmentType.C_SHARP;
            }
            default -> {
                return null;
            }
        }
    }

}
