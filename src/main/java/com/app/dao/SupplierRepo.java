package com.app.dao;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.entities.Supplier;

@Repository
public interface SupplierRepo extends JpaRepository<Supplier, Long> {
	List<Supplier> findByLocationAndNatureOfBusinessAndManufacturingProcessesContains(
		    String location,
		    Supplier.NatureOfBusiness natureOfBusiness,
		    Supplier.ManufacturingProcess manufacturingProcess,
		    Pageable pageable
		);
}
