package com.app.service;

import java.util.List;

import com.app.entities.Supplier;
import com.app.entities.Supplier.NatureOfBusiness;

public interface SupplierService {
	List<Supplier> querySuppliers(String location, Supplier.NatureOfBusiness natureOfBusiness, Supplier.ManufacturingProcess manufacturingProcess, int limit);

	//List<Supplier> querySuppliers(String location, NatureOfBusiness natureOfBusiness);
}
