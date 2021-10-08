package com.producer_consumer_demo;

public class Main {
    public static void main(String[] args) {

    }
}

class Message {
    private String message;
    private boolean isEmpty = true;

    public synchronized String read(){
        while(isEmpty){

        }
        isEmpty=true;
        return message;
    }

    public synchronized void write(String msg){
        while(!isEmpty){

        }
        isEmpty=false;
        message=msg;
    }
}

class Producer implements Runnable {
    private Message message;

    public Producer(Message message) {
        this.message = message;
    }

    @Override
    public void run() {

    }
}

class Consumer implements Runnable {
    private Message message;

    public Consumer(Message message) {
        this.message = message;
    }

    @Override
    public void run() {

    }
}
