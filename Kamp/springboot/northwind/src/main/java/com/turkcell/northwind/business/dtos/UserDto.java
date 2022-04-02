package com.turkcell.northwind.business.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    
    private String id;
    private String email;
    private String password;
    private String encryptedPassword;
}
