package org.academiadecodigo.maindalorians;

public class NotEnoughSpaceException extends Exception{
    public NotEnoughSpaceException(){

    }
    public NotEnoughSpaceException(String name){
        super(name);
    }
}
