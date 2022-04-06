package com.turkcell.elearner.application.features.commands.create;

import com.turkcell.elearner.domain.AccountType;
import com.turkcell.elearner.persistence.AccountTypeRepository;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//Bu sadece create işleminin manageridir. Tüm metodları ayırıyoruz bu yapıda

@Component
public class AccountTypeEventsHandler {
    
    private AccountTypeRepository accountTypeRepository;

    @Autowired
    public AccountTypeEventsHandler(AccountTypeRepository accountTypeRepository) {
        
        this.accountTypeRepository = accountTypeRepository;
    }

    @EventHandler
    public void on(AccountTypeCreatedEvent accountTypeCreatedEvent){
        AccountType accountType = new AccountType();
        BeanUtils.copyProperties(accountTypeCreatedEvent, accountType);
        this.accountTypeRepository.save(accountType);
    }
}
