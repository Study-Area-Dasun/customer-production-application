package lk.ijse.dep10.backend.service.impl;

import lk.ijse.dep10.backend.dto.CustomerDTO;
import lk.ijse.dep10.backend.dto.CustomerLoggingDTO;
import lk.ijse.dep10.backend.repositry.CustomerRepository;
import lk.ijse.dep10.backend.service.CustomerService;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;
    private final ModelMapper mapper;
    public CustomerServiceImpl(CustomerRepository customerRepository, ModelMapper mapper) {
        this.customerRepository = customerRepository;
        this.mapper = mapper;
    }
    @Override
    public CustomerDTO customerLogging(CustomerLoggingDTO customerLoggingDTO) {

            CustomerDTO customerDTO=customerRepository.findCustomerByEmail(customerLoggingDTO.getEmail())
                    .map(customer -> mapper.map(customer, CustomerDTO.class)).orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND,
                            "The email: " + customerLoggingDTO.getEmail() + " does not exist"));
            if(customerDTO.getPassword().equals(customerLoggingDTO.getPassword())){
                return customerDTO;
            }
          throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Invalid Password");
    }
}
