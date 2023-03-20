package com.example.designPattern.singleton.singleton2;

public class SingletonPattern2 {
    private final String str;

    private static volatile SingletonPattern2 instance;

    private SingletonPattern2(String str) {
        this.str = str;
    }

    public static SingletonPattern2 getInstance(String data) {
        SingletonPattern2 result = instance;
        if (result == null) {
            synchronized (SingletonPattern2.class) {
                result = instance;
                if (result == null) {
                    instance = result = new SingletonPattern2(data);
                }
            }
        }
        return result;
    }

    public String getData() {
        return str;
    }

}

class Main{
    public static void main(String[] args) {

        System.out.println(SingletonPattern2.getInstance("Instance"));
        SingletonPattern2 singleton = SingletonPattern2.getInstance("Hello World");
        System.out.println(singleton);
        System.out.println(singleton.getData());

    }

}
