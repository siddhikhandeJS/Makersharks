package com.app.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class SupplierDto {
	
	@NotBlank
    private String location;

    @NotNull
    private String natureOfBusiness;

    @NotNull
    private String manufacturingProcess;

    @Min(1)
    @Max(100)
    private int limit = 10;

}
