package com.get.promoter.controller;

import com.get.promoter.dto.SimpleRegistrationEditDTO;
import com.get.promoter.service.SimpleRegistrationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class SimpleRegistrationController {

    private final SimpleRegistrationService service;

    public SimpleRegistrationController(SimpleRegistrationService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public ResponseEntity<SimpleRegistrationEditDTO> findById(@PathVariable Long id) {
        return new ResponseEntity<>(this.service.findById(id), HttpStatus.OK);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String save(SimpleRegistrationEditDTO dto) {
        this.service.save(dto);
        return "redirect:/home";
    }

}
