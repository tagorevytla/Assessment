package com.Teksystems.Assessment.validators;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Constraint(validatedBy = PhoneNumberValidator.class)
@Target({FIELD, METHOD, PARAMETER})
@Retention(RUNTIME)
public @interface ValidatePhoneNumber {

    String message() default "Invalid Phone number. Should be only numeric with length of 7 or 10";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
