package com.cristian.football_api.exception;

public class TimeNaoEncontradoException extends RuntimeException{
    public TimeNaoEncontradoException(String msg){
        super(msg);
    }
}
