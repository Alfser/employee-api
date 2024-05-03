package com.alfser.employeeapi.dto;

import lombok.Data;

@Data
public class AddressDTO {
    private int id;
    private String street;
    private int number;
    private int ownerId;
}
