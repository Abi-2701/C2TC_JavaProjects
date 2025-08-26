package com.abi.userdefinedexception_assignment;

//Custom Exception: Thrown when withdrawal exceeds balance
class InsufficientFundsException extends Exception {
 public InsufficientFundsException(String message) {
     super(message);
 }
}