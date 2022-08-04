package com.alkemy.icons.icons.mapper;

import com.alkemy.icons.icons.dto.CountryDTO;
import com.alkemy.icons.icons.entitiy.CountryEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CountryMapper {


    public CountryEntity countryDTO2Entity(CountryDTO dto) {
        CountryEntity countryEntity = new CountryEntity();
        countryEntity.setId(dto.getId());
        countryEntity.setDenominacion(dto.getDenominacion());
        countryEntity.setImagen(dto.getImagen());
        countryEntity.setCantidadHabitantes(dto.getCantidadHabitantes());
        countryEntity.setSuperficie(dto.getSuperficie());
        countryEntity.setIcons(dto.getIcons());
        countryEntity.setContinente(dto.getContinente());
        countryEntity.setContinenteId(dto.getContinente().getId());

        return countryEntity;
    }

    public CountryDTO countryEntity2DTO(CountryEntity entity){

        CountryDTO dto = new CountryDTO();
        dto.setId(entity.getId());
        dto.setImagen(entity.getImagen());
        dto.setDenominacion(entity.getDenominacion());
        dto.setSuperficie(entity.getSuperficie());
        dto.setCantidadHabitantes(entity.getCantidadHabitantes());
        dto.setIcons(entity.getIcons());
        dto.setContinente(entity.getContinente());
        dto.setId(entity.getContinente().getId());

        return dto;

    }

    public List<CountryDTO> countryEntity2DTOList(List<CountryEntity> entities){

        List<CountryDTO> dtos = new ArrayList<>();
        for (CountryEntity entity: entities
             ) {

            dtos.add(countryEntity2DTO(entity));

        }
        return dtos;
    }
}
