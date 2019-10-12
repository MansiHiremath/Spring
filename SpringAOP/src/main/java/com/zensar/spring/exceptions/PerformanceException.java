package com.zensar.spring.exceptions;

public class PerformanceException extends Exception {
private String errorMsg;
public PerformanceException() {
	// TODO Auto-generated constructor stub
errorMsg="Performance is not satisfactory";
}
public PerformanceException(String errorMsg) {
	super();
	this.errorMsg = errorMsg;
}
@Override
public String toString() {
	return "PerformanceException [errorMsg=" + errorMsg + "]";
}

}
