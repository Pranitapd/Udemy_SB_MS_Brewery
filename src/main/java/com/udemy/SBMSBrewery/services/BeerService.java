package com.udemy.SBMSBrewery.services;

import com.udemy.SBMSBrewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

public interface BeerService {
    BeerDto getBearById(UUID beerId);
}
