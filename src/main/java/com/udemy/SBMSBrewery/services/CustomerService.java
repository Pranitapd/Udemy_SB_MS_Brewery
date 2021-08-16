package com.udemy.SBMSBrewery.services;

import com.udemy.SBMSBrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);
}
