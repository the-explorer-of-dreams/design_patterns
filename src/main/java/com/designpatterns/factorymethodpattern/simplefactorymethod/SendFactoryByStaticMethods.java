package com.designpatterns.factorymethodpattern.simplefactorymethod;

import com.designpatterns.factorymethodpattern.sender.MailSender;
import com.designpatterns.factorymethodpattern.sender.Sender;
import com.designpatterns.factorymethodpattern.sender.SmsSender;

public class SendFactoryByStaticMethods {

    public static Sender produceSms() {
        return new SmsSender();
    }

    public static Sender produceMail() {
        return new MailSender();
    }
}
