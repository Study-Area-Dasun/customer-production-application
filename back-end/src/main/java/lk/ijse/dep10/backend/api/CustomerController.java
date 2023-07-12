package lk.ijse.dep10.backend.api;

import lk.ijse.dep10.backend.dto.CustomerDTO;
import lk.ijse.dep10.backend.dto.CustomerLoggingDTO;
import lk.ijse.dep10.backend.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customers")
@CrossOrigin
public class CustomerController {
    private final CustomerService customerService;
    public CustomerController(CustomerService customerService) {

        this.customerService = customerService;
    }
    // Endpoint to save a customer
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/save")
    public void saveCustomer(@RequestBody @Validated CustomerDTO customerDTO){
        customerService.saveCustomer(customerDTO);
    }
    // Endpoint for customer logging
    @PostMapping
    public CustomerDTO customerLogging(@RequestBody @Validated CustomerLoggingDTO customerLoggingDTO){
        return customerService.customerLogging(customerLoggingDTO);

    }

}
