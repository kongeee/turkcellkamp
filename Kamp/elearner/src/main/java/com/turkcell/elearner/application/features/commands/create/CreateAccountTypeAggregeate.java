package com.turkcell.elearner.application.features.commands.create;

import org.springframework.beans.BeanUtils;

@Aggregate
public class CreateAccountTypeAggregeate {
    
    @AggregateIdentifier
    private String accountTypeId;
    private String accountName;
    private double price;
    private String description;

    public CreateAccountTypeAggregeate() {
        
    }

    @CommandHandler()
    public CreateAccountTypeAggregeate(CreateAccountTypeCommand createAccountTypeCommand){
        //business codes.

        AccountTypeCreatedEvent accountTypeCreatedEvent = new AccountTypeCreatedEvent();

        BeanUtils.copyProperties(createAccountTypeCommand, accountTypeCreatedEvent);

        AggregateLifecycle.apply(accountTypeCreatedEvent);
    }

    @EventSourcingHandler
    public void on(AccountTypeCreatedEvent accountTypeCreatedEvent){
        //event sourcing

        this.accountTypeId = accountTypeCreatedEvent.getAccountTypeId();
        this.accountName = accountTypeCreatedEvent.getAccountName();
        this.price = accountTypeCreatedEvent.getPrice();
        this.description = accountTypeCreatedEvent.getDescription();
    }
}
