package com.alkemy.icons.icons.service.impl;

import com.alkemy.icons.icons.entitiy.ContinentEntity;
import com.alkemy.icons.icons.mapper.ContinentMapper;
import com.alkemy.icons.icons.repository.ContinentRepository;
import com.alkemy.icons.icons.service.ContinentService;
import com.alkemy.icons.icons.dto.ContinentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContinentServiceImpl implements ContinentService {

    @Autowired
    private ContinentMapper continenteMapper;

    @Autowired
    private ContinentRepository continentRepository;


    public ContinentDTO save(ContinentDTO dto) {

        ContinentEntity entity = continenteMapper.continenteDTO2Entity(dto);
        ContinentEntity entitySaved = continentRepository.save(entity);
        ContinentDTO result = continenteMapper.continentEntity2DTO(entitySaved);
        return result;
    }


    public List<ContinentDTO> getAllContinents() {
        List<ContinentEntity> entities = continentRepository.findAll();
        List<ContinentDTO> results = continenteMapper.continentEntity2DTOList(entities);
        return results;

    }
}
