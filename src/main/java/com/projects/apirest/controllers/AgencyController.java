package com.projects.apirest.controllers;

import com.projects.apirest.entities.Agency;
import com.projects.apirest.repositories.AgencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/agency")
public class AgencyController {

    @Autowired
    private AgencyRepository agencyRepository;

    @GetMapping
    public List<Agency> findAll(){
        return agencyRepository.findAll();
    }

    @PostMapping
    public Agency save(@RequestBody Agency agency){
        return agencyRepository.save(agency);
    }

    @GetMapping(value="/{id}")
    public Agency findById(@PathVariable Long id){
        return agencyRepository.findById(id).get();
    }

}
