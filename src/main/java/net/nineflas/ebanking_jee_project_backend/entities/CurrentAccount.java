package net.nineflas.ebanking_jee_project_backend.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.*;
import net.nineflas.ebanking_jee_project_backend.entities.BankAccount;

@Data @AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity

// stragtegy single table
@DiscriminatorValue("CR")
public class CurrentAccount extends BankAccount {
    private double overDraft;
}