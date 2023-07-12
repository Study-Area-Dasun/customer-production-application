package lk.ijse.dep10.backend.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {
    @GetMapping
    public String getCustomer(){
        return "<h1>Hello Word</h1>";
    }
}
