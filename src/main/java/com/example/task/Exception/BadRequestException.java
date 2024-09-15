package com.example.task.Exception;

public class BadRequestException extends RuntimeException{

    BadRequestException(String message){
        super(message);
    }
}
