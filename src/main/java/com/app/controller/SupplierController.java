package com.app.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.SupplierDto;
import com.app.entities.Supplier;
import com.app.service.SupplierService;

@RestController
@RequestMapping("/api/supplier")
public class SupplierController {
	

    private final SupplierService supplierService;

    @Autowired
    public SupplierController(SupplierService supplierService) {
        this.supplierService = supplierService;
    }

    @PostMapping("/query")
    public List<Supplier> querySuppliers(@Valid @RequestBody SupplierDto request) {
        Supplier.NatureOfBusiness natureOfBusiness = Supplier.NatureOfBusiness.valueOf(request.getNatureOfBusiness().toUpperCase());
        Supplier.ManufacturingProcess manufacturingProcess = Supplier.ManufacturingProcess.valueOf(request.getManufacturingProcess().toUpperCase());
        return supplierService.querySuppliers(request.getLocation(), natureOfBusiness, manufacturingProcess, request.getLimit());
    }
    
}
