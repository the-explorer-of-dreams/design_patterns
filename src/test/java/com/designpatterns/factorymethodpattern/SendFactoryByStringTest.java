package com.designpatterns.factorymethodpattern;

public class SendFactoryByStringTest {
    public static void main(String[] args) {
        SendFactoryByString sendFactoryByString = new SendFactoryByString();
        Sender sender = sendFactoryByString.produce("sms");
        sender.send();
    }

}
