package com.turkcell.elearner.application.features.commands.create;

import lombok.Builder;
import lombok.Data;

//bunu request nesnesi gibi düşünebiliriz.

@Data
@Builder
public class CreateAccountTypeCommand {
    
    @TargetAggregateIdentifier
    private String accountTypeId;
    private String accountName;
    private double price;
    private String description;
}
