package com.get.promoter.service;

import com.get.promoter.dto.CommissionDTO;
import com.get.promoter.dto.CommissionEditDTO;
import com.get.promoter.exception.NotFoundException;
import com.get.promoter.model.Commission;
import com.get.promoter.repository.CommissionRepository;
import org.springframework.stereotype.Service;

@Service
public class CommissionService implements DefaultService {

    private final CommissionRepository repository;

    public CommissionService(CommissionRepository repository) {
        this.repository = repository;
    }

    public Long update(final CommissionEditDTO dto) {
        this.findCommissionById(dto.getId());
        return this.repository.save(this.convertToEntity(dto)).getId();
    }

    public CommissionDTO findById(final Long id) {
        return findCommissionById(id);
    }

    private CommissionDTO findCommissionById(final Long id) {
        return this.convertToDto(this.repository
                .findById(id)
                .orElseThrow(() -> new NotFoundException("Comissão não encontrado!")));
    }

    private CommissionDTO convertToDto(final Commission entity) {
        return this.getModelMapper().map(entity, CommissionDTO.class);
    }

    private Commission convertToEntity(final CommissionEditDTO dto) {
        return this.getModelMapper().map(dto, Commission.class);
    }
}
