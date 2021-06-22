package org.academiadecodigo.network;

public class Test implements Runnable{
private WebServer server;
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
