package com.get.promoter.repository;

import com.get.promoter.model.Commission;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CommissionRepository extends PagingAndSortingRepository<Commission, Long> {
}
