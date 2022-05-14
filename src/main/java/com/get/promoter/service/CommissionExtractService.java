package com.get.promoter.service;

import com.get.promoter.dto.CommissionExtractDTO;
import com.get.promoter.exception.NotFoundException;
import com.get.promoter.model.CommissionExtract;
import com.get.promoter.repository.CommissionExtractRepository;
import org.springframework.stereotype.Service;

@Service
public class CommissionExtractService implements DefaultService {

    private final CommissionExtractRepository repository;
//    private final SimpleRegistrationService simpleRegistrationService;


    public CommissionExtractService(CommissionExtractRepository repository) {
        this.repository = repository;
    }

    public Long save(final CommissionExtractDTO dto) {
        CommissionExtract commissionExtract = this.convertToEntity(dto);
//        commissionExtract.setIndicated(simpleRegistrationService.findEntityById(dto.getIdIndicator()));
        return this.repository.save(commissionExtract).getId();
    }

    public CommissionExtractDTO findById(final Long id) {
        return findCommissionById(id);
    }

    private CommissionExtractDTO findCommissionById(final Long id) {
        return this.convertToDto(this.repository
                .findById(id)
                .orElseThrow(() -> new NotFoundException("Comissão não encontrado!")));
    }

    private CommissionExtractDTO convertToDto(final CommissionExtract entity) {
        return this.getModelMapper().map(entity, CommissionExtractDTO.class);
    }

    private CommissionExtract convertToEntity(final CommissionExtractDTO dto) {
        return this.getModelMapper().map(dto, CommissionExtract.class);
    }
}
