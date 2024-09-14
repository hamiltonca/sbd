/*
 * Copyright (c) 2024.
 * Computer and Technology Consulting, Inc.
 * All Rights reserved.
 */

package com.compucafe.sbd.service;

import com.compucafe.sbd.jpa.dao.AccountRepository;
import com.compucafe.sbd.jpa.dto.Account;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    AccountRepository accountRepository;
    AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public Account getAccountByName(String name) {
        return accountRepository.findByUsername(name);
    }
}
