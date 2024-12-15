package com.eazybytes.accounts.mapper.config;

import com.eazybytes.accounts.mapper.AccountDtoToAccountMapper;
import com.eazybytes.accounts.mapper.AccountToAccountDtoMapper;
import com.eazybytes.accounts.mapper.CustomerDtoToCustomerMapper;
import com.eazybytes.accounts.mapper.CustomerToCustomerDtoMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfiguration {

    @Bean
    public AccountToAccountDtoMapper accountToAccountDtoMapper() {
        return new AccountToAccountDtoMapper();
    }

    @Bean
    public AccountDtoToAccountMapper accountDtoToAccountMapper() {
        return new AccountDtoToAccountMapper();
    }

    @Bean
    public CustomerToCustomerDtoMapper customerToCustomerDtoMapper() {
        return new CustomerToCustomerDtoMapper();
    }

    @Bean
    public CustomerDtoToCustomerMapper customerDtoToCustomerMapper() {
        return new CustomerDtoToCustomerMapper();
    }
}
