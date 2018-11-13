package com.designpatterns.factorymethodpattern;

public class SendFactoryByMethods {

    public Sender produceSms() {
        return new SmsSender();
    }

    public Sender produceMail() {
        return new MailSender();
    }
}
