package com.alkemy.icons.icons.repository;

import com.alkemy.icons.icons.entitiy.ContinenteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContinentRepository extends JpaRepository<ContinenteEntity, Long> {


}
