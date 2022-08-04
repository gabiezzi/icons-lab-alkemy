package com.alkemy.icons.icons.mapper;

import com.alkemy.icons.icons.dto.ContinentDTO;
import com.alkemy.icons.icons.entitiy.ContinentEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ContinentMapper {

    public ContinentEntity continenteDTO2Entity(ContinentDTO dto) {

        ContinentEntity continenteEntity = new ContinentEntity();
        continenteEntity.setImagen(dto.getImagen());
        continenteEntity.setDenominacion(dto.getDenominacion());
        return continenteEntity;
    }

    public ContinentDTO continentEntity2DTO(ContinentEntity entity) {
        ContinentDTO dto = new ContinentDTO();
        dto.setId(entity.getId());
        dto.setImagen(entity.getImagen());
        dto.setDenominacion(entity.getDenominacion());
        return dto;
    }

    public List<ContinentDTO> continentEntity2DTOList(List<ContinentEntity> entities) {

        List<ContinentDTO> dtos = new ArrayList<>();
        for (ContinentEntity entity : entities) {

            dtos.add(continentEntity2DTO(entity));

        }
        return dtos;

    }
}
