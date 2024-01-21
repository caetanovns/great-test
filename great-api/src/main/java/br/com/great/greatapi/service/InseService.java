package br.com.great.greatapi.service;

import br.com.great.greatapi.domain.inse.Inse;
import br.com.great.greatapi.domain.inse.InseRepository;
import br.com.great.greatapi.dto.InseAggregationDTO;
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
        return inseRepository.customQuery(city, school, uf).stream().map(p -> modelMapper.map(p, InseDTO.class)).collect(Collectors.toList());
    }

    public InseAggregationDTO resumeData(String city, String uf) {
        var items = inseRepository.customQuery(city, null, uf);

        var inseAvg = items.stream().mapToDouble(Inse::getInseAvg).average().orElse(0.0);
        var inseMax = items.stream().mapToDouble(Inse::getInseAvg).max().orElse(0.0);
        var inseMin = items.stream().mapToDouble(Inse::getInseAvg).min().orElse(0.0);

        var studentsAmount = items.stream().mapToInt(Inse::getStudentsAmount).sum();
        var studentsAvg = items.stream().mapToDouble(Inse::getStudentsAmount).average().orElse(0.0);
        var studentsMax = items.stream().mapToDouble(Inse::getStudentsAmount).max().orElse(0.0);
        var studentsMin = items.stream().mapToDouble(Inse::getStudentsAmount).min().orElse(0.0);

        return new InseAggregationDTO(inseAvg, inseMax, inseMin, studentsAmount, studentsAvg, studentsMin, studentsMax);
    }

    public InseDTO readOne(String id) {
        Inse inse = inseRepository.findById(id);
        return this.modelMapper.map(inse, InseDTO.class);
    }
}
