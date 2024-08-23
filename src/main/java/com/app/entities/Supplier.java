package com.app.entities;

import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;


@Entity
@Table(name = "suppliers")
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long supplierId;

    private String companyName;

    private String website;

    private String location;

    @Enumerated(EnumType.STRING)
    private NatureOfBusiness natureOfBusiness;

    @ElementCollection(targetClass = ManufacturingProcess.class)
    @CollectionTable(name = "supplier_processes", joinColumns = @JoinColumn(name = "supplier_id"))
    @Enumerated(EnumType.STRING)
    @Column(name = "process")
    private Set<ManufacturingProcess> manufacturingProcesses;

    public enum NatureOfBusiness {
        SMALL_SCALE, MEDIUM_SCALE, LARGE_SCALE
    }

    public enum ManufacturingProcess {
        MOULDING, PRINTING_3D, CASTING, COATING
    }
}
