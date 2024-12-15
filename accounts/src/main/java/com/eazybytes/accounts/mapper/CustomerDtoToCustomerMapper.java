package com.eazybytes.accounts.mapper;

import com.eazybytes.accounts.dto.CustomerDto;
import com.eazybytes.accounts.entity.Customer;

import java.util.function.BiConsumer;

public class CustomerDtoToCustomerMapper implements BiConsumer<CustomerDto, Customer> {

    /**
     * Performs this operation on the given arguments.
     *
     * @param customerDto the first input argument
     * @param customer    the second input argument
     */
    @Override
    public void accept(CustomerDto customerDto, Customer customer) {
        customerDto.setName(customer.getName());
        customerDto.setMobileNumber(customer.getMobileNumber());
        customerDto.setEmail(customer.getEmail());
    }
}
