package com.alkemy.icons.icons.mapper;

import com.alkemy.icons.icons.dto.ContinentDTO;
import com.alkemy.icons.icons.dto.IconDTO;
import com.alkemy.icons.icons.entitiy.IconEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class IconMapper {

    public IconEntity iconDTO2Entity(IconDTO dto){
        IconEntity iconEntity = new IconEntity();
        iconEntity.setImagen(dto.getImagen());
        iconEntity.setDenominacion(dto.getDenominacion());
        iconEntity.setAltura(dto.getAltura());
        iconEntity.setHistoria(dto.getHistoria());
        iconEntity.setCreacionFecha(dto.getCreacionFecha());
        iconEntity.setPaises(dto.getPaises());

        return iconEntity;
    }

    public IconDTO iconEntity2DTO(IconEntity entity){
        IconDTO dto = new IconDTO();
        dto.setId(entity.getId());
        dto.setImagen(entity.getImagen());
        dto.setDenominacion(entity.getDenominacion());
        dto.setAltura(entity.getAltura());
        dto.setHistoria(entity.getHistoria());
        dto.setCreacionFecha(entity.getCreacionFecha());
        dto.setPaises(entity.getPaises());

        return dto;
    }

    public List<IconDTO> iconEntity2DTOList(List<IconEntity> entities){

        List<IconDTO> dtos = new ArrayList<>();

        for (IconEntity entity : entities
             ) {
            dtos.add(iconEntity2DTO(entity));
        }

        return dtos;
    }
}