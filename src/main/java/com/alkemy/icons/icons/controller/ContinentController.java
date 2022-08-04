package com.alkemy.icons.icons.controller;


import com.alkemy.icons.icons.service.ContinentService;
import com.alkemy.icons.icons.dto.ContinentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("continents")
public class ContinentController {

    @Autowired
    private ContinentService continenteService;

    @GetMapping
    public ResponseEntity<List<ContinentDTO>> getAll(){
        List<ContinentDTO> continents = continenteService.getAllContinents();
        return ResponseEntity.ok().body(continents);

    }

    @PostMapping
    public ResponseEntity<ContinentDTO> save(@RequestBody ContinentDTO continent) {
        ContinentDTO continentSaved = continenteService.save(continent);
        return ResponseEntity.status(HttpStatus.CREATED).body(continentSaved);//201 , exito , continente guardado

    }

}
