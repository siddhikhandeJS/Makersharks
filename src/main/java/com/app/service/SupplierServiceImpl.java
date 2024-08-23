package com.app.service;

import java.util.List;
import java.util.stream.Collectors;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.SupplierRepo;
import com.app.dto.SupplierDto;
import com.app.entities.ManufacturingProcess;
import com.app.entities.NatureOfBusiness;
import com.app.entities.Supplier;

@Service
public class SupplierServiceImpl implements SupplierService {

	private final SupplierRepo supplierRepository;

    @Autowired
    public SupplierServiceImpl(SupplierRepo supplierRepository) {
        this.supplierRepository = supplierRepository;
    }

    @Override
    @Transactional
    public List<SupplierDto> querySuppliers(String location, NatureOfBusiness natureOfBusiness, ManufacturingProcess manufacturingProcess, int limit) {
        List<Supplier> suppliers = supplierRepository.findByLocationAndNatureOfBusinessAndManufacturingProcessesContains(
                location, natureOfBusiness, manufacturingProcess, PageRequest.of(0, limit)
        );

        // Initialize lazy-loaded collections
        suppliers.forEach(supplier -> Hibernate.initialize(supplier.getManufacturingProcesses()));

        // Convert to DTO
        return suppliers.stream().map(SupplierDto::new).collect(Collectors.toList());
    }
}
