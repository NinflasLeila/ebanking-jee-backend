package net.nineflas.ebanking_jee_project_backend.repositories;

import net.nineflas.ebanking_jee_project_backend.entities.BankAccount;
import net.nineflas.ebanking_jee_project_backend.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BankAccountRepository extends JpaRepository<BankAccount, String> {
    void deleteBankAccountsByCustomer(Customer customer);

    List<BankAccount> findByCustomer(Customer customer);
}
