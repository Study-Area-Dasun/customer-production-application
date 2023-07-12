package lk.ijse.dep10.backend.service;

import lk.ijse.dep10.backend.dto.CustomerDTO;
import lk.ijse.dep10.backend.dto.CustomerLoggingDTO;
import lk.ijse.dep10.backend.dto.ProductDTO;

import java.util.List;

public interface ProductService {
    List<ProductDTO> getProduct(String group_id);

}
