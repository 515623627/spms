package com.spms.validator;

public interface BaseValidator<T> {

	public T validateWhenSave(T object);
	public T validateWhenDelete(T object);
	public T validateWhenUpdate(T object);
	public T validateWhenQuery(T object);
}
