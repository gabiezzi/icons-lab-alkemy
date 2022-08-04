package com.alkemy.icons.icons.controller;

import com.alkemy.icons.icons.dto.CountryDTO;
import com.alkemy.icons.icons.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("countries")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @PostMapping
    public ResponseEntity<CountryDTO> save(@RequestBody CountryDTO country){

        CountryDTO countrySaved = countryService.save(country);
        return ResponseEntity.status(HttpStatus.CREATED).body(countrySaved);

    }


}
