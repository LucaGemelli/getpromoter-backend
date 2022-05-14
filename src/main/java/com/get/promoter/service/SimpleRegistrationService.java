package com.get.promoter.service;

import com.get.promoter.dto.SimpleRegistrationEditDTO;
import com.get.promoter.exception.NotFoundException;
import com.get.promoter.model.SimpleRegistration;
import com.get.promoter.repository.SimpleRegistrationRepository;
import org.springframework.stereotype.Service;

@Service
public class SimpleRegistrationService implements DefaultService {

    private final SimpleRegistrationRepository repository;

    public SimpleRegistrationService(SimpleRegistrationRepository repository) {
        this.repository = repository;
    }

    public Long save(final SimpleRegistrationEditDTO dto) {
        return this.repository.save(this.convertToEntity(dto)).getId();
    }

    public SimpleRegistrationEditDTO findById(final Long id) {
        return findSimpleRegistrationById(id);
    }

    public SimpleRegistration findEntityById(final Long id) {
       return this.repository.findById(id).orElseThrow(() -> new NotFoundException("Cadastro não encontrado!"));
    }

    private SimpleRegistrationEditDTO findSimpleRegistrationById(final Long id) {
        return this.convertToDto(this.repository.findById(id).orElseThrow(() -> new NotFoundException("Cadastro não encontrado!")));
    }

    private SimpleRegistrationEditDTO convertToDto(final SimpleRegistration entity) {
        return this.getModelMapper().map(entity, SimpleRegistrationEditDTO.class);
    }

    private SimpleRegistration convertToEntity(final SimpleRegistrationEditDTO dto) {
        return this.getModelMapper().map(dto, SimpleRegistration.class);
    }
}
