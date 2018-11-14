package com.designpatterns.factorymethodpattern;

import com.designpatterns.factorymethodpattern.sender.Sender;
import com.designpatterns.factorymethodpattern.simplefactorymethod.SendFactoryByStaticMethods;

public class SendFactoryByStaticMethodsTest {
    public static void main(String[] args) {
        Sender sender = SendFactoryByStaticMethods.produceSms();
        sender.send();
    }

}
