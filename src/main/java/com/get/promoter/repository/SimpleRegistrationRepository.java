package com.get.promoter.repository;

import com.get.promoter.model.SimpleRegistration;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface SimpleRegistrationRepository extends PagingAndSortingRepository<SimpleRegistration, Long> {
}
