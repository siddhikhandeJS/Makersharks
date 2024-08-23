// package com.makersharks.service;

// import com.makersharks.entity.Supplier;
// import com.makersharks.repository.SupplierRepository;
// import org.junit.jupiter.api.Test;
// import org.mockito.Mockito;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.test.context.SpringBootTest;
// import org.springframework.boot.test.mock.mockito.MockBean;

// import java.util.Collections;
// import java.util.List;

// import static org.junit.jupiter.api.Assertions.assertEquals;

// @SpringBootTest
// public class SupplierServiceTest {

//     @Autowired
//     private SupplierService supplierService;

//     @MockBean
//     private SupplierRepository supplierRepository;

//     @Test
//     void querySuppliers_ShouldReturnSuppliers() {
//         Supplier mockSupplier = new Supplier();
//         mockSupplier.setCompanyName("Test Company");
//         mockSupplier.setLocation("India");
//         mockSupplier.setNatureOfBusiness(Supplier.NatureOfBusiness.SMALL_SCALE);
//         mockSupplier.setManufacturingProcesses(Collections.singleton(Supplier.ManufacturingProcess.PRINTING_3D));

//         Mockito.when(supplierRepository.findByLocationAndNatureOfBusinessAndManufacturingProcessesContains(
//                 Mockito.anyString(), Mockito.any(Supplier.NatureOfBusiness.class), Mockito.any(Supplier.ManufacturingProcess.class))
//         ).thenReturn(Collections.singletonList(mockSupplier));

//         List<Supplier> suppliers = supplierService.querySuppliers("India", Supplier.NatureOfBusiness.SMALL_SCALE, Supplier.ManufacturingProcess.PRINTING_3D, 1);

//         assertEquals(1, suppliers.size());
//         assertEquals("Test Company", suppliers.get(0).getCompanyName());
//     }
// }
