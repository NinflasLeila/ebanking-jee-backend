package net.nineflas.ebanking_jee_project_backend.dtos;

import java.util.Date;
import lombok.*;
import net.nineflas.ebanking_jee_project_backend.enums.AccountStatus;

@Data @AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SavingBankAccountDTO extends BankAccountDTO {
    private String  id;
    private double balance;
    private Date createdAt;
    private AccountStatus status;
    private CustomerDTO customerDTO;
    private double interestRate;
}
