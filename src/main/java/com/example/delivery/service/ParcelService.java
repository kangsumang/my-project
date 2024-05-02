package com.example.delivery.service;

import com.example.delivery.model.ParcelCostResponse;
import com.example.delivery.model.ParcelRequest;
import org.springframework.stereotype.Service;

@Service
public class ParcelService {

    public ParcelCostResponse calculateDeliveryCost(ParcelRequest request) {
        // Implement calculation logic here
        // Call VoucherService to apply discounts
        // Return ParcelCostResponse
        return null;
    }
}
