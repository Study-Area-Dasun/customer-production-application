package lk.ijse.dep10.backend.repositry;

import lk.ijse.dep10.backend.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Book;
import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,String>{
    Optional<Customer> findCustomerByEmail(String s);
}
