package com.vijay.learn.sbms.msscbrewery.v2.services;
/*
Project : mssc-brewery
IDE     : IntelliJ IDEA
User    : Vijay Gupta
Date    : 19 July 2020
*/

import com.vijay.learn.sbms.msscbrewery.v2.web.model.BeerDto;
import com.vijay.learn.sbms.msscbrewery.v2.web.model.BeerStyleEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service("beerServiceV2")
public class BeerServiceImpl implements BeerService {

    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle(BeerStyleEnum.ALE)
                .build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
        //ToDo to add actual implementation to update Beer
    }

    @Override
    public void deleteById(UUID beerId) {
        log.debug("deleting the Beer...");
    }


}
