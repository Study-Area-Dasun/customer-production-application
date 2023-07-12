package lk.ijse.dep10.backend.repositry;

import lk.ijse.dep10.backend.entity.Customer;
import lk.ijse.dep10.backend.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface ProductRepository extends JpaRepository<Product,String> {
    List<Customer> findProductByGroup_id(String s);
}
