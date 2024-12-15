package com.eazybytes.accounts.mapper;

import com.eazybytes.accounts.dto.AccountDto;
import com.eazybytes.accounts.entity.Account;

import java.util.function.BiConsumer;

public class AccountToAccountDtoMapper implements BiConsumer<Account, AccountDto> {

    /**
     * Performs this operation on the given arguments.
     *
     * @param account    the first input argument
     * @param accountDto the second input argument
     */
    @Override
    public void accept(Account account, AccountDto accountDto) {

        accountDto.setAccountNumber(account.getAccountNumber());
        accountDto.setAccountType(account.getAccountType());
        accountDto.setBranchAddress(account.getBranchAddress());
    }
}
