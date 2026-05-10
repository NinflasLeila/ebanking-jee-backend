package net.nineflas.ebanking_jee_project_backend.exceptions;

import net.nineflas.ebanking_jee_project_backend.entities.BankAccount;

public class BankAccountNotFoundException extends Exception {
    public BankAccountNotFoundException(String message){
        super(message);
    }
}
