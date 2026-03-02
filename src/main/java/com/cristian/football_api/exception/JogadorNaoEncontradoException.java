package com.cristian.football_api.exception;

public class JogadorNaoEncontradoException extends RuntimeException{
    public JogadorNaoEncontradoException(String msg){
        super(msg);
    }
}
