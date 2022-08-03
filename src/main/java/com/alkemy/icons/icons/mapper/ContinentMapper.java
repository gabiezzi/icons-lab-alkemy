package com.alkemy.icons.icons.mapper;

import com.alkemy.icons.icons.dto.ContinentDTO;
import com.alkemy.icons.icons.entitiy.ContinenteEntity;
import org.springframework.stereotype.Component;

@Component
public class ContinentMapper {

    public ContinenteEntity continenteDTO2Entity(ContinentDTO dto){

        ContinenteEntity continenteEntity = new ContinenteEntity();
        continenteEntity.setImagen(dto.getImagen());
        continenteEntity.setDenominacion(dto.getDenominacion());
        return continenteEntity;
    }
}
