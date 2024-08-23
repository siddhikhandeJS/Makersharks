package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.app.dao.SupplierRepo;
import com.app.entities.Supplier;

@Service
public class SupplierServiceImpl implements SupplierService {

	private final SupplierRepo supplierRepository;

    @Autowired
    public SupplierServiceImpl(SupplierRepo supplierRepository) {
        this.supplierRepository = supplierRepository;
    }
	
    @Override
    public List<Supplier> querySuppliers(String location, Supplier.NatureOfBusiness natureOfBusiness, Supplier.ManufacturingProcess manufacturingProcess, int limit) {
        return supplierRepository.findByLocationAndNatureOfBusinessAndManufacturingProcessesContains(
                location, natureOfBusiness, manufacturingProcess, PageRequest.of(0, limit)
        );
    }
}
