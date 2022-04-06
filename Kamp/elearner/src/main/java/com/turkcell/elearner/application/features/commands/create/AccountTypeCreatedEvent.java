package com.turkcell.elearner.application.features.commands.create;


import lombok.Data;


@Data
public class AccountTypeCreatedEvent {
    
    private String accountTypeId;
    private String accountName;
    private double price;
    private String description;
}
