package com.eazybytes.accounts.mapper;

import com.eazybytes.accounts.dto.CustomerDto;
import com.eazybytes.accounts.entity.Customer;

import java.util.function.BiConsumer;

public class CustomerToCustomerDtoMapper implements BiConsumer<Customer, CustomerDto> {

    /**
     * Performs this operation on the given arguments.
     *
     * @param customer    the first input argument
     * @param customerDto the second input argument
     */
    @Override
    public void accept(Customer customer, CustomerDto customerDto) {
        customerDto.setName(customer.getName());
        customerDto.setMobileNumber(customer.getMobileNumber());
        customerDto.setEmail(customer.getEmail());
    }
}
