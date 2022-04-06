package com.turkcell.elearner.ws.controllers;

import java.util.UUID;

import com.turkcell.elearner.application.features.commands.create.CreateAccountTypeCommand;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accounttypes")
public class AccountTypesController {
    private CommandGateway commandGateway;

    public AccountTypesController(CommandGateway commandGateway) {
        this.commandGateway = commandGateway;
    }

    @PostMapping()
    public void CreateAccountType(@RequestBody createAccountTypeCommand){
        createAccountTypeCommand.setAccountTypeId(UUID.randomUUID().toString());
        this.commandGateway.sendAndWait(createAccountTypeCommand);
    }
}
