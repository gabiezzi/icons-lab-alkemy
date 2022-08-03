package com.alkemy.icons.icons.entitiy;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
public class PaisEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String imagen;

    private String denominacion;

    @Column(name = "cant_habitantes")
    private Long cantidadHabitantes;

    private Long superficie; //m2

    @ManyToOne(fetch = FetchType.EAGER , cascade = CascadeType.ALL)
    @JoinColumn(name = "continente_id" , insertable = false , updatable = false)
    private ContinenteEntity continente;

    @Column(name = "continente_id" , nullable = false)
    private Long continenteId;

    @ManyToMany(
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            })
    @JoinTable(
            name = "icon_pais",
            joinColumns = @JoinColumn(name= "pais_id"),
            inverseJoinColumns = @JoinColumn(name = "icon_id"))
    private Set<IconoEntity> icons = new HashSet<>();



    @Override
    public boolean equals(Object object){
        if (object == null)
            return false;
        if (getClass() != object.getClass())
            return false;
        final PaisEntity other = (PaisEntity) object;
        return other.id == this.id;
    }
}
