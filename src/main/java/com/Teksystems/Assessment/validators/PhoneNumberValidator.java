package com.Teksystems.Assessment.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class PhoneNumberValidator implements ConstraintValidator<ValidatePhoneNumber, String> {

    private static List<Pattern> phoneNumValidPatterns =
            Arrays.asList(Pattern.compile("^\\d{7}"), Pattern.compile("^\\d{10}"));

    @Override
    public void initialize(ValidatePhoneNumber constraintAnnotation) {
    }

    @Override
    public boolean isValid(String contactField, ConstraintValidatorContext cxt) {
        return contactField != null && phoneNumValidPatterns.stream().anyMatch(x -> x.matcher(contactField).matches());
    }

}