package com.axis.exception;

public class InValidSalaryException extends RuntimeException{

	String msg;
	 
    public InValidSalaryException(String msg) {
        super();
        this.msg = msg;
    }
 
    public String getMsg() {
        return msg;
    }
}
