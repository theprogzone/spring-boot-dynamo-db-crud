package com.anuradha.springdynamodb.service;

import com.anuradha.springdynamodb.dto.EmployeeDTO;
import com.anuradha.springdynamodb.dto.ResponseDTO;

import java.util.List;

public interface EmployeeService {
    ResponseDTO<EmployeeDTO> saveEmployee(EmployeeDTO employeeDTO);

    List<EmployeeDTO> getAllEmployees();

    EmployeeDTO getEmployee(String id);

    ResponseDTO<EmployeeDTO> updateEmployee(EmployeeDTO employeeDTO);

    ResponseDTO<EmployeeDTO> deleteEmployee(String id);
}
