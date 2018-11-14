package com.designpatterns.factorymethodpattern;

import com.designpatterns.factorymethodpattern.factorymethod.Provider;
import com.designpatterns.factorymethodpattern.factorymethod.SendMailFactory;
import com.designpatterns.factorymethodpattern.sender.Sender;
import com.designpatterns.factorymethodpattern.simplefactorymethod.SendFactoryByMethods;

public class SendFactoryMethodTest {
    public static void main(String[] args) {
        Provider provider = new SendMailFactory();
        Sender sender = provider.produce();
        sender.send();
    }

}
