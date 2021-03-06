package com.vijay.learn.sbms.msscbrewery.v2.web.controller;
/*
Project : mssc-brewery
IDE     : IntelliJ IDEA
User    : Vijay Gupta
Date    : 19 July 2020
*/

import com.vijay.learn.sbms.msscbrewery.v2.services.BeerService;
import com.vijay.learn.sbms.msscbrewery.v2.web.model.BeerDto;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.ConstraintViolationException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RequestMapping("/api/v2/beer")
@RestController("beerControllerV2")
public class BeerController {
    private final BeerService beerService;

    public BeerController(@Qualifier("beerServiceV2") BeerService beerService) {
        this.beerService = beerService;
    }

    @GetMapping({"/{beerId}"})
    public ResponseEntity<BeerDto> getBeer(@PathVariable("beerId") UUID beerId){

        return new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK);
    }

    @PostMapping//POST create new beer
    public ResponseEntity handlePost(@RequestBody BeerDto beerDto){
        BeerDto savedDto = beerService.saveNewBeer(beerDto);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Location","/api/v2/beer/"+savedDto.getId().toString());
        return new ResponseEntity(headers,HttpStatus.CREATED);
    }

    @PutMapping({"/{beerId}"})
    public ResponseEntity updateBeer(@PathVariable("beerId") UUID beerId,@RequestBody BeerDto beerDto){
        beerService.updateBeer(beerId,beerDto);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping({"/{beerId}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)//Another implementation where return type can be void with ResponseStatus Annotation
    public void deleteBeer(@PathVariable("beerId") UUID beerId){
        beerService.deleteById(beerId);
    }

    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<List> validationErrorHandler(ConstraintViolationException e){
        List<String> errors = new ArrayList<>(e.getConstraintViolations().size());

        e.getConstraintViolations().forEach(constraintViolation -> {
            errors.add(constraintViolation.getPropertyPath() + " : " + constraintViolation.getMessage());
        });

        return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
    }
}
