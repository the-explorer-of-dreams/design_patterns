package com.designpatterns.factorymethodpattern;

import com.designpatterns.factorymethodpattern.sender.Sender;
import com.designpatterns.factorymethodpattern.simplefactorymethod.SendFactoryByString;

public class SendFactoryByStringTest {
    public static void main(String[] args) {
        SendFactoryByString sendFactoryByString = new SendFactoryByString();
        Sender sender = sendFactoryByString.produce("sms");
        sender.send();
    }

}
