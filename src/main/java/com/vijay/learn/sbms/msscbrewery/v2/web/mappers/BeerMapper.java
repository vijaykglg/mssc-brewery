package com.vijay.learn.sbms.msscbrewery.v2.web.mappers;
/*
Project : mssc-brewery
IDE     : IntelliJ IDEA
User    : Vijay Gupta
Date    : 26 July 2020
*/

import com.vijay.learn.sbms.msscbrewery.v2.domain.Beer;
import com.vijay.learn.sbms.msscbrewery.v2.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {
    BeerDto beerToBeerDto(Beer beer);
    Beer beerDtoToBeer(BeerDto dto);
}
