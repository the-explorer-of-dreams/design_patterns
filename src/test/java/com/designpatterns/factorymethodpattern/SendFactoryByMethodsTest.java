package com.designpatterns.factorymethodpattern;

import com.designpatterns.factorymethodpattern.sender.Sender;
import com.designpatterns.factorymethodpattern.simplefactorymethod.SendFactoryByMethods;

public class SendFactoryByMethodsTest {
    public static void main(String[] args) {
        SendFactoryByMethods sendFactoryByMethods = new SendFactoryByMethods();
        Sender sender = sendFactoryByMethods.produceMail();
        sender.send();
    }

}
