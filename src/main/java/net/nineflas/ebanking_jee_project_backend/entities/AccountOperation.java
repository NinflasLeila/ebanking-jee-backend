package net.nineflas.ebanking_jee_project_backend.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
@Entity
@Data @NoArgsConstructor
@AllArgsConstructor
@Getter @Setter

public class AccountOperation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date operationDate;
    private double amount;
    @Enumerated(EnumType.STRING)
    private OperationType type;


    // operation et compte
    @ManyToOne
    private  BankAccount bankAccount;
    private String description;

}