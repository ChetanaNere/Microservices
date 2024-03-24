package com.cjc.main.serviceimpl;

public class ProductNotExistException extends RuntimeException {
public ProductNotExistException(String message)
{
	super(message);
}
}
