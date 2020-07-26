package com.vijay.learn.sbms.msscbrewery.v2.web.mappers;
/*
Project : mssc-brewery
IDE     : IntelliJ IDEA
User    : Vijay Gupta
Date    : 26 July 2020
*/

import com.vijay.learn.sbms.msscbrewery.v2.domain.Customer;
import com.vijay.learn.sbms.msscbrewery.v2.web.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {
    CustomerDto customerToCustomerDto(Customer customer);
    Customer customerDtoToCustomer(CustomerDto dto);
}
