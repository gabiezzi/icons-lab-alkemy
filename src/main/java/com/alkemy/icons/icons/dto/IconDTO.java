package com.alkemy.icons.icons.dto;

import com.alkemy.icons.icons.entitiy.CountryEntity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Setter
@Getter
public class IconDTO {

    private Long id;

    private String imagen;

    private String denominacion;

    private Date creacionFecha;

    private String altura;

    private String historia;

    private List<CountryEntity> paises = new ArrayList<>() ;

}
