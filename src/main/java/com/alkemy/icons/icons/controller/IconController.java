package com.alkemy.icons.icons.controller;

import com.alkemy.icons.icons.dto.IconDTO;
import com.alkemy.icons.icons.entitiy.IconEntity;
import com.alkemy.icons.icons.service.IconService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("icons")
public class IconController {

    @Autowired
    private IconService iconService;

    @PostMapping
    public ResponseEntity<IconDTO> save(@RequestBody IconDTO icon){
        IconDTO iconSaved = iconService.save(icon);
        return ResponseEntity.status(HttpStatus.CREATED).body(iconSaved);
    }

    @GetMapping("/all")
    public ResponseEntity<List<IconDTO>> getAll(){
        List<IconDTO> icons = iconService.getAll();
        return ResponseEntity.ok().body(icons);

    }

    @GetMapping("/{id}")
    public ResponseEntity<List<IconDTO>> getDetailsById(@PathVariable Long id){
        IconDTO icon = iconService.getDetailsById(id);
        return ResponseEntity.ok(icon);
    }
}
