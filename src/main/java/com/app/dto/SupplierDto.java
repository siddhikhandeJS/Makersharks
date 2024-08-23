package com.app.dto;

import java.util.Set;

import com.app.entities.ManufacturingProcess;
import com.app.entities.NatureOfBusiness;
import com.app.entities.Supplier;

import lombok.Data;

@Data
public class SupplierDto {
	
	 private Long supplierId;
	    private String companyName;
	    private String website;
	    private String location;
	    private NatureOfBusiness natureOfBusiness;
	    private Set<ManufacturingProcess> manufacturingProcesses;

	    public SupplierDto(Supplier supplier) {
	        this.supplierId = supplier.getSupplierId();
	        this.companyName = supplier.getCompanyName();
	        this.website = supplier.getWebsite();
	        this.location = supplier.getLocation();
	        this.natureOfBusiness = supplier.getNatureOfBusiness();
	        this.manufacturingProcesses = supplier.getManufacturingProcesses();
	    }

}
