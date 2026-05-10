package net.nineflas.ebanking_jee_project_backend.repositories;

import net.nineflas.ebanking_jee_project_backend.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface CustomerRepository extends JpaRepository<Customer,Long> {
    List<Customer> findByNameContains(String customerName);


    Customer getCustomersById(Long id);
}