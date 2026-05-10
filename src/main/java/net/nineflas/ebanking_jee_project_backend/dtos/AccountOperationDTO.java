package net.nineflas.ebanking_jee_project_backend.dtos;


import lombok.*;
import net.nineflas.ebanking_jee_project_backend.entities.BankAccount;
import net.nineflas.ebanking_jee_project_backend.enums.OperationType;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AccountOperationDTO {
    private Long id;
    private Date operationDate;
    private double amount;
    private OperationType type;
    private BankAccount bankAccount;
    private String description;
}
