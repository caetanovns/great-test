package br.com.great.greatapi.controller;

import br.com.great.greatapi.dto.InseDTO;
import br.com.great.greatapi.service.InseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inse")
public class InseController {


    @Autowired
    private InseService inseService;

    @GetMapping
    public Page<InseDTO> findAll(@PageableDefault(size = 10) Pageable pageable) {
        return inseService.readAll(pageable);
    }

    @GetMapping("/{id}")
    public InseDTO readOne(@PathVariable String id) {
        return inseService.readOne(id);
    }
}
