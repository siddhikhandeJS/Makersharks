package com.app.service;

import java.util.List;

import com.app.dto.SupplierDto;
import com.app.entities.ManufacturingProcess;
import com.app.entities.NatureOfBusiness;

public interface SupplierService {
	List<SupplierDto> querySuppliers(String location, NatureOfBusiness natureOfBusiness, ManufacturingProcess manufacturingProcess, int limit);

	//List<Supplier> querySuppliers(String location, NatureOfBusiness natureOfBusiness);
}
