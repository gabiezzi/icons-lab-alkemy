package com.alkemy.icons.icons.entitiy;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
public class IconoEntity {


    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String imagen;

    private String denominacion;

    @Column(name = "fecha_creacion")
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private Date creacionFecha;

    private String altura;

    private String historia;

    @ManyToMany(mappedBy = "icons" , cascade = CascadeType.ALL)
    private List <PaisEntity> paises = new ArrayList<>() ;





}
