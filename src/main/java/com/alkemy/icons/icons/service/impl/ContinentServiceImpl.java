package com.alkemy.icons.icons.service.impl;

import com.alkemy.icons.icons.entitiy.ContinenteEntity;
import com.alkemy.icons.icons.mapper.ContinentMapper;
import com.alkemy.icons.icons.service.ContinentService;
import com.alkemy.icons.icons.dto.ContinentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContinentServiceImpl implements ContinentService {

    @Autowired
    private ContinentMapper continenteMapper;

    @Override
    public ContinentDTO save(ContinentDTO dto) {

        ContinenteEntity entity = continenteMapper.continenteDTO2Entity(dto);
        //GUARDAMOS TODO: guardar continente recibido
        System.out.println("Guardamos continente!");
        return dto;
    }
}
