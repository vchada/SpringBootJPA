package com.geico.ecc.gfr.entity;

import java.util.List;

/**
 * @author Venkata Chada
 *
 */
public interface EmployeeService {
    public List<Employee> retrieveEmployees();

    public Employee getEmployee(Long employeeId);

    public void saveEmployee(Employee employee);

    public void deleteEmployee(Long employeeId);

    public void updateEmployee(Employee employee);
}
