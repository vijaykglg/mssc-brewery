package com.vijay.learn.sbms.msscbrewery.v2.domain;
/*
Project : mssc-brewery
IDE     : IntelliJ IDEA
User    : Vijay Gupta
Date    : 26 July 2020
*/

import com.vijay.learn.sbms.msscbrewery.v2.web.model.BeerStyleEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Beer {
    private UUID id;
    private String beerName;
    private BeerStyleEnum beerStyle;
    private Long upc;
}
