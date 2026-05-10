package net.nineflas.ebanking_jee_project_backend.exceptions;

public class BalanceNotSufficientException extends Exception{
    public BalanceNotSufficientException(String message){
        super(message);
    }
}
