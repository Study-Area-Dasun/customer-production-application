package lk.ijse.dep10.backend.repositry;

import lk.ijse.dep10.backend.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer>{
    // Find a customer by email
    Optional<Customer> findCustomerByEmail(String s);

    // Check if a customer exists with the given email
    boolean existsByEmail(String email);
}
