package com.Teksystems.Assessment.service;

import com.Teksystems.Assessment.model.PhoneNumber;

import java.util.List;

public interface PhoneNumberPermutationsInterface {

    public List<String> createAllPermutations(String phoneNumber);
}
