package br.com.great.greatapi.service;

import br.com.great.greatapi.domain.inse.Inse;
import br.com.great.greatapi.domain.inse.InseRepository;
import br.com.great.greatapi.dto.InseDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class InseService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private InseRepository inseRepository;

    public List<InseDTO> readAll(Pageable pageable, String city, String school, String uf) {
        //return inseRepository.findAllByCity(pageable, city).map(p -> modelMapper.map(p, InseDTO.class));
        return inseRepository.customQuery(city, school, uf).stream().map(p -> modelMapper.map(p, InseDTO.class)).collect(Collectors.toList());
    }

    public InseDTO readOne(String id) {
        Inse inse = inseRepository.findById(id);
        return this.modelMapper.map(inse, InseDTO.class);
    }
}
