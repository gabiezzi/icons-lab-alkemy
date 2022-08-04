package com.alkemy.icons.icons.service.impl;

import com.alkemy.icons.icons.dto.CountryDTO;
import com.alkemy.icons.icons.entitiy.CountryEntity;
import com.alkemy.icons.icons.mapper.CountryMapper;
import com.alkemy.icons.icons.repository.CountryRepository;
import com.alkemy.icons.icons.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryMapper countryMapper;

    @Autowired
    private CountryRepository countryRepository;


    public CountryDTO save(CountryDTO dto) {

        CountryEntity entity = countryMapper.countryDTO2Entity(dto);
        CountryEntity entitySaved = countryRepository.save(entity);
        CountryDTO result = countryMapper.countryEntity2DTO(entitySaved);
        return result;
    }

    public List<CountryDTO> getAllCountries(){
        List<CountryEntity> entities = countryRepository.findAll();
        List<CountryDTO> results = countryMapper.countryEntity2DTOList(entities);

        return results;
    }

}
