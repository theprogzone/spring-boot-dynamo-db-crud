package com.anuradha.springdynamodb.dto;

import java.math.BigDecimal;
import java.util.Date;

public record EmployeeDTO(String id, String name, BigDecimal monthlySalary, Date birthDate, String phone, String email, Boolean isMarried) {
}
