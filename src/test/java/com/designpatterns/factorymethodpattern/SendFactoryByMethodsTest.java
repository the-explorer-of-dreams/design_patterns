package com.designpatterns.factorymethodpattern;

public class SendFactoryByMethodsTest {
    public static void main(String[] args) {
        SendFactoryByMethods sendFactoryByMethods = new SendFactoryByMethods();
        Sender sender = sendFactoryByMethods.produceMail();
        sender.send();
    }

}
