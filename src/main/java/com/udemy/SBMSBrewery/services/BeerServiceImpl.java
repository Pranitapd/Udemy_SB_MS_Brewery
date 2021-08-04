package com.udemy.SBMSBrewery.services;

import com.udemy.SBMSBrewery.web.model.BeerDto;

import java.util.UUID;

public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBearById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                        .beerStyle("Pale Ale")
                        .build();
    }
}
