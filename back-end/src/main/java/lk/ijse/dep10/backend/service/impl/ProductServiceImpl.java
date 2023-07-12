package lk.ijse.dep10.backend.service.impl;

import lk.ijse.dep10.backend.dto.CustomerDTO;
import lk.ijse.dep10.backend.dto.CustomerLoggingDTO;
import lk.ijse.dep10.backend.dto.ProductDTO;
import lk.ijse.dep10.backend.repositry.ProductRepository;
import lk.ijse.dep10.backend.service.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;
    private final ModelMapper mapper;

    public ProductServiceImpl(ProductRepository productRepository, ModelMapper mapper) {
        this.productRepository = productRepository;
        this.mapper = mapper;
    }

    @Override
    public List<ProductDTO> getProduct(int q) {
        if(q != 0) {
            // Find products by group ID
            return productRepository.findProductByGroupId(q)
                    .stream().map(product -> mapper.map(product, ProductDTO.class)).collect(Collectors.toList());
        }else {
            // Retrieve all products
            return productRepository.findAll()
                    .stream().map(product -> mapper.map(product, ProductDTO.class)).collect(Collectors.toList());

        }
    }
}
