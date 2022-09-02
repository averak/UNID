package dev.abelab.unid.api.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import dev.abelab.unid.api.request.BaseRequest;

/**
 * Request Validator
 */
public class RequestValidator implements ConstraintValidator<RequestValidation, BaseRequest> {

    @Override
    public void initialize(RequestValidation constraintAnnotation) {}

    @Override
    public boolean isValid(final BaseRequest baseRequest, final ConstraintValidatorContext constraintValidatorContext) {
        baseRequest.validate();
        return true;
    }
}
