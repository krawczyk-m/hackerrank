package com.hackerrank.mk.exceptions;

/**
 * Created by kravvcu on 09.09.15.
 */
public class MissingArgumentException extends Exception {

    public MissingArgumentException() { super(); }

    public MissingArgumentException(String message) { super(message); }
}
