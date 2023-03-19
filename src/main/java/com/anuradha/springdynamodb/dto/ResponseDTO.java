package com.anuradha.springdynamodb.dto;

public record ResponseDTO<T>(String message, T content) {
}
