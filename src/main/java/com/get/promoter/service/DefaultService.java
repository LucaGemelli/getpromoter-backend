package com.get.promoter.service;

import org.modelmapper.ModelMapper;

public interface DefaultService {

    public static final ModelMapper modelMapper = new ModelMapper();

    public default ModelMapper getModelMapper() {
        return modelMapper;
    }
}
