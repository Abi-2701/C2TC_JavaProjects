package com.abi.userdefinedexception_assignment;

//Custom Exception: Thrown when deposit/withdraw amount is invalid
class InvalidAmountException extends Exception {
 public InvalidAmountException(String message) {
     super(message);
 }
}