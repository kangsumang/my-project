package com.example.delivery.controller;

import com.example.delivery.model.ParcelCostResponse;
import com.example.delivery.model.ParcelRequest;
import com.example.delivery.service.ParcelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParcelController {

    @Autowired
    private ParcelService parcelService;

    @PostMapping("/api/parcel/calculateCost")
    public ResponseEntity<ParcelCostResponse> calculateCost(@RequestBody ParcelRequest request) {
        ParcelCostResponse response = parcelService.calculateDeliveryCost(request);
        return ResponseEntity.ok(response);
    }
}
