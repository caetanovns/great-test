package br.com.great.greatapi.service;

import br.com.great.greatapi.domain.inse.InseRepository;
import br.com.great.greatapi.dto.InseDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class InseService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private InseRepository inseRepository;

    public List<InseDTO> readAll() {
        return inseRepository.findAll().stream().limit(5).map(p -> modelMapper.map(p, InseDTO.class)).collect(Collectors.toList());
    }
}
