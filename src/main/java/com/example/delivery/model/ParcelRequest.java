package com.example.delivery.model;

public class ParcelRequest {
    private Parcel parcel;
    private String voucherCode;

    // Constructor
    public ParcelRequest(Parcel parcel, String voucherCode) {
        this.parcel = parcel;
        this.voucherCode = voucherCode;
    }

    // Getters and setters
    public Parcel getParcel() {
        return parcel;
    }

    public void setParcel(Parcel parcel) {
        this.parcel = parcel;
    }

    public String getVoucherCode() {
        return voucherCode;
    }

    public void setVoucherCode(String voucherCode) {
        this.voucherCode = voucherCode;
    }
}
