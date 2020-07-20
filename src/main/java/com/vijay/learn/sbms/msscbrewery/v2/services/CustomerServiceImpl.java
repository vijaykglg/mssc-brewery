package com.vijay.learn.sbms.msscbrewery.v2.services;
/*
Project : mssc-brewery
IDE     : IntelliJ IDEA
User    : Vijay Gupta
Date    : 19 July 2020
*/

import com.vijay.learn.sbms.msscbrewery.v2.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service("customerServiceV2")
public class CustomerServiceImpl implements CustomerService {

    @Override
    public CustomerDto getCustomer(UUID customerId) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("Joe Buck")
                .build();
    }

    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
        log.debug("ToDo-updating a new customer");
    }

    @Override
    public void deleteCustomerById(UUID customerId) {
        log.debug("ToDo-Deleting a customer");
    }
}
