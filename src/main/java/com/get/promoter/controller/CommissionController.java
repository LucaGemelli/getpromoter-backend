package com.get.promoter.controller;

import com.get.promoter.dto.CommissionDTO;
import com.get.promoter.dto.CommissionEditDTO;
import com.get.promoter.service.CommissionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/commission")
public class CommissionController {

    private final CommissionService service;

    public CommissionController(CommissionService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public ResponseEntity<CommissionDTO> findById(@PathVariable Long id) {
        return new ResponseEntity<>(this.service.findById(id), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Long> update(@Valid @RequestBody CommissionEditDTO dto) {
        return new ResponseEntity<>(this.service.update(dto), HttpStatus.OK);
    }
}
