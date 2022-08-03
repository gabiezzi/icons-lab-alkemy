package com.alkemy.icons.icons.controller;


import com.alkemy.icons.icons.service.ContinentService;
import com.alkemy.icons.icons.dto.ContinentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("continentes")
public class ContinentController {

    @Autowired
    private ContinentService continenteService;

    @PostMapping
    public ResponseEntity<ContinentDTO> save(@RequestBody ContinentDTO contiente) {
        ContinentDTO continenteSaved = continenteService.save(contiente);
        return ResponseEntity.status(HttpStatus.CREATED).body(continenteSaved);//201 , exito , continente guardado

    }

}
