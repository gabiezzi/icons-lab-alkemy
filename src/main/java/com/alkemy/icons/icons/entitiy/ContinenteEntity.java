package com.alkemy.icons.icons.entitiy;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;


@Entity
@Table(name = "contiene")
@Getter
@Setter
public class ContinenteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String imagen;

    private String denominacion;




}
