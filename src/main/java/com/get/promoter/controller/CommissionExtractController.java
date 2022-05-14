package com.get.promoter.controller;

import com.get.promoter.dto.CommissionExtractDTO;
import com.get.promoter.service.CommissionExtractService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/commission/extract")
public class CommissionExtractController {

    private final CommissionExtractService service;

    public CommissionExtractController(CommissionExtractService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public ResponseEntity<CommissionExtractDTO> findById(@PathVariable Long id) {
        return new ResponseEntity<>(this.service.findById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Long> save(@Valid @RequestBody CommissionExtractDTO dto) {
        return new ResponseEntity<>(this.service.save(dto), HttpStatus.OK);
    }
}
