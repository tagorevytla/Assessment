package com.Teksystems.Assessment.controller;

import com.Teksystems.Assessment.service.PhoneNumberPermutationsInterface;
import com.Teksystems.Assessment.validators.ValidatePhoneNumber;
import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.Valid;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/permutations")
@Validated
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class InputValidationController {

    final PhoneNumberPermutationsInterface service;

    public InputValidationController(PhoneNumberPermutationsInterface service) {
        this.service = service;
    }

    @GetMapping(value = "/phoneNumber/{phoneNo}")
    public HttpEntity<List<String>> loadFormPage(@PathVariable(value = "phoneNo") @ValidatePhoneNumber String phoneNum) {
        return new HttpEntity<>(service.createAllPermutations(phoneNum));
    }

    @ExceptionHandler(value = {ConstraintViolationException.class})
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public String handleResourceNotFoundException(ConstraintViolationException validationEx) {
        // we might only have 1 validation, but this set representation helps even if we
        // add multiple validations in future.
        Set<ConstraintViolation<?>> violations = validationEx.getConstraintViolations();
        StringBuilder strBuilder = new StringBuilder();
        for (ConstraintViolation<?> violation : violations) {
            strBuilder.append(violation.getMessage() + "\n");
        }
        return strBuilder.toString();
    }

}