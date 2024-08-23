package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.SupplierDto;
import com.app.entities.ManufacturingProcess;
import com.app.entities.NatureOfBusiness;
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
	    public List<SupplierDto> querySuppliers(
	            @RequestParam String location,
	            @RequestParam NatureOfBusiness natureOfBusiness,
	            @RequestParam ManufacturingProcess manufacturingProcess,
	            @RequestParam(defaultValue = "10") int limit) {
	        return supplierService.querySuppliers(location, natureOfBusiness, manufacturingProcess, limit);
	    }
    
}
