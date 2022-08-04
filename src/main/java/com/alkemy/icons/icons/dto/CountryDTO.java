package com.alkemy.icons.icons.dto;

import com.alkemy.icons.icons.entitiy.ContinentEntity;
import com.alkemy.icons.icons.entitiy.IconEntity;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;


@Setter
@Getter
public class CountryDTO {

    private Long id;

    private String imagen;

    private String denominacion;

    private Long cantidadHabitantes;

    private Long superficie;

    private ContinentEntity continente;

    private Long continenteId;

    private Set<IconEntity> icons = new HashSet<>();

}
