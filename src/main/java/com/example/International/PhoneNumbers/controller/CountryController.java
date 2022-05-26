package com.example.International.PhoneNumbers.controller;

import com.example.International.PhoneNumbers.entity.Country;
import com.example.International.PhoneNumbers.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.International.PhoneNumbers.repository.CountryRepository;

import java.util.List;

@RestController
@RequestMapping("/api/internationalnumbers/v1")
public class CountryController {
    @Autowired
    private CountryRepository countryRepository;

    @Autowired
    private CountryService countryService;

    @GetMapping("/countries")
    public List<Country> getAllCountries(){
        return countryService.getAllCountries();

    }
}
