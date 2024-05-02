package com.example.delivery.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class ParcelServiceTest {

    @Autowired
    private ParcelService parcelService;

    @Test
    public void testCalculateDeliveryCost() {
        // Write test cases to validate the calculation logic
        assertNotNull(parcelService);
    }
}
