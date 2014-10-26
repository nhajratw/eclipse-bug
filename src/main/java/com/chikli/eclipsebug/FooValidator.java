package com.chikli.eclipsebug;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class FooValidator implements ConstraintValidator<FooValidation, Object> {

	@Override
	public boolean isValid(final Object value, final ConstraintValidatorContext context) {
		return true;
	}

	@Override
	public void initialize(final FooValidation constraintAnnotation) {
	}

}