package net.nineflas.ebanking_jee_project_backend.exceptions;

public class CustomerNotFoundException extends Exception {
    public CustomerNotFoundException(String message){
        super(message);
    }
}
