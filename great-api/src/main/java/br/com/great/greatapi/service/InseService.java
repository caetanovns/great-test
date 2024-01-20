package br.com.great.greatapi.service;

import br.com.great.greatapi.domain.inse.Inse;
import br.com.great.greatapi.domain.inse.InseRepository;
import br.com.great.greatapi.dto.InseDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class InseService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private InseRepository inseRepository;

    public Page<InseDTO> readAll(Pageable pageable) {
        return inseRepository.findAll(pageable).map(p -> modelMapper.map(p, InseDTO.class));
    }

    public InseDTO readOne(String id) {
        Inse inse = inseRepository.findById(id);
        return this.modelMapper.map(inse, InseDTO.class);
    }
}
