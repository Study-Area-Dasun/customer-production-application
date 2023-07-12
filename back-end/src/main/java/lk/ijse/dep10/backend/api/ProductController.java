package lk.ijse.dep10.backend.api;

import lk.ijse.dep10.backend.dto.ProductDTO;
import lk.ijse.dep10.backend.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
@CrossOrigin
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<ProductDTO> getProduct( String q){
        return productService.getProduct(q);
    }
}
