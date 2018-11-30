package com.designpatterns.factorymethodpattern.factory.provider;

import com.designpatterns.factorymethodpattern.ware.sender.MailSender;
import com.designpatterns.factorymethodpattern.ware.sender.Sender;

public class SendMailFactory implements Provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
