package com.alkemy.icons.icons.service.impl;

import com.alkemy.icons.icons.dto.IconDTO;
import com.alkemy.icons.icons.entitiy.IconEntity;
import com.alkemy.icons.icons.mapper.IconMapper;
import com.alkemy.icons.icons.repository.IconRepository;
import com.alkemy.icons.icons.service.IconService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IconServiceImpl implements IconService {

    @Autowired
    private IconMapper iconMapper;

    @Autowired
    private IconRepository iconRepository;


    public IconDTO save(IconDTO dto) {


        IconEntity entity = iconMapper.iconDTO2Entity(dto);
        IconEntity entitySaved = iconRepository.save(entity);
        IconDTO result = iconMapper.iconEntity2DTO(entitySaved);
        return result;

    }

    @Override
    public List<IconDTO> getAll() {
        List<IconEntity> icons = iconRepository.findAll();
        List<IconDTO> results = iconMapper.iconEntity2DTOList(icons);
        return results;
    }

    @Override
    public IconDTO getDetailsById(Long id) {
        IconEntity entity = iconRepository.findById(id);
        return null;
    }
}
