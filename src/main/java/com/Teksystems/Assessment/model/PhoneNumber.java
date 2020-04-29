package com.Teksystems.Assessment.model;

import javax.validation.constraints.NotNull;

public class PhoneNumber {

    @NotNull
    private String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }


    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Validation{" +
                "phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

}
