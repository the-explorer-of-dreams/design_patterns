package com.designpatterns.factorymethodpattern.factorymethod;

import com.designpatterns.factorymethodpattern.sender.MailSender;
import com.designpatterns.factorymethodpattern.sender.Sender;

public class SendMailFactory implements Provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
