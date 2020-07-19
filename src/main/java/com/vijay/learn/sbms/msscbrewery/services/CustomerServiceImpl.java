package com.vijay.learn.sbms.msscbrewery.services;
/*
Project : mssc-brewery
IDE     : IntelliJ IDEA
User    : Vijay Gupta
Date    : 19 July 2020
*/

import com.vijay.learn.sbms.msscbrewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public CustomerDto getCustomer(UUID customerId) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("Joe Buck")
                .build();
    }
}
