package br.com.great.greatapi.controller;

import br.com.great.greatapi.dto.InseAggregationDTO;
import br.com.great.greatapi.dto.InseDTO;
import br.com.great.greatapi.service.InseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inse")
public class InseController {


    @Autowired
    private InseService inseService;

    @GetMapping
    public ResponseEntity<List<InseDTO>> findAll(@PageableDefault(size = 10) Pageable pageable,
                                                 @RequestParam(required = false) String city,
                                                 @RequestParam(required = false) String school,
                                                 @RequestParam(required = false) String uf
    ) {
        return ResponseEntity.ok(inseService.readAll(pageable, city, school, uf));
    }

    @GetMapping("/resume")
    public ResponseEntity<InseAggregationDTO> resume(@RequestParam(required = false) String city,
                                                     @RequestParam(required = false) String uf) {
        return ResponseEntity.ok(inseService.resumeData(city, uf));
    }

    @GetMapping("/{id}")
    public InseDTO readOne(@PathVariable String id) {
        return inseService.readOne(id);
    }
}
