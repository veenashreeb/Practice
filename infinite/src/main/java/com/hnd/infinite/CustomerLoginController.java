package com.hnd.infinite;

import com.hnd.infinite.Exception.HnDBankException;
import com.hnd.infinite.service.CustomerLoginService;
import com.hnd.infinite.dto.CustomerDTO;
import com.hnd.infinite.dto.CustomerType;
import com.hnd.infinite.dto.CustomerLoginDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller(value="customerLoginController")
public class CustomerLoginController {
    @Autowired
    private CustomerLoginService customerLoginService;
    public String authenticateCustomer(CustomerLoginDTO customerLogin) throws HnDBankException {
        String b = customerLoginService.authenticateCustomer(customerLogin);
        return b;
    }
}