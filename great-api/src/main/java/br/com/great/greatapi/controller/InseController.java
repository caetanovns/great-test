package br.com.great.greatapi.controller;

import br.com.great.greatapi.dto.InseDTO;
import br.com.great.greatapi.service.InseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/inse")
public class InseController {


    @Autowired
    private InseService inseService;

    @GetMapping
    public List<InseDTO> findAll() {
        return inseService.readAll();
    }
}
