package lk.ijse.dep10.backend.service;

import lk.ijse.dep10.backend.dto.CustomerDTO;
import lk.ijse.dep10.backend.dto.CustomerLoggingDTO;

public interface CustomerService {
    CustomerDTO customerLogging(CustomerLoggingDTO customerLoggingDTO);
}
