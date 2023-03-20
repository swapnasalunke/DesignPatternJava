package com.example.designPattern.singleton.singleton1;

public class SingletonPattern1 {
    private static SingletonPattern1 instance = new SingletonPattern1();
    private SingletonPattern1(){}
    public static SingletonPattern1 getInstance(){
        return instance;
    }
    public void printMessage(){
        System.out.println("Hello from Singleton object!!!");
    }
}

class Main {
    public static void main(String[] args) {
        SingletonPattern1 object = SingletonPattern1.getInstance();
        object.printMessage();
    }
}