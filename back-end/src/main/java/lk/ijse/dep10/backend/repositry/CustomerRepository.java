package lk.ijse.dep10.backend.repositry;

import lk.ijse.dep10.backend.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer>{
    Optional<Customer> findCustomerByEmail(String s);

    boolean existsByEmail(String email);
}
