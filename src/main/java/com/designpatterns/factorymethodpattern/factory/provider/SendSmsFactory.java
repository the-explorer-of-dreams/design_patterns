package com.designpatterns.factorymethodpattern.factory.provider;

import com.designpatterns.factorymethodpattern.ware.sender.Sender;
import com.designpatterns.factorymethodpattern.ware.sender.SmsSender;

public class SendSmsFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
