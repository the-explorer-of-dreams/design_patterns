package com.designpatterns.factorymethodpattern.simplefactorymethod;

import com.designpatterns.factorymethodpattern.sender.MailSender;
import com.designpatterns.factorymethodpattern.sender.Sender;
import com.designpatterns.factorymethodpattern.sender.SmsSender;

public class SendFactoryByMethods {

    public Sender produceSms() {
        return new SmsSender();
    }

    public Sender produceMail() {
        return new MailSender();
    }
}
