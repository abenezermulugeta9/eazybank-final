package com.eazybytes.accounts.mapper;

import com.eazybytes.accounts.dto.AccountDto;
import com.eazybytes.accounts.entity.Account;

import java.util.function.BiConsumer;

public class AccountDtoToAccountMapper implements BiConsumer<AccountDto, Account> {

    /**
     * Performs this operation on the given arguments.
     *
     * @param accountDto the first input argument
     * @param account    the second input argument
     */
    @Override
    public void accept(AccountDto accountDto, Account account) {

        account.setAccountNumber(accountDto.getAccountNumber());
        account.setAccountType(accountDto.getAccountType());
        account.setBranchAddress(accountDto.getBranchAddress());
    }
}
