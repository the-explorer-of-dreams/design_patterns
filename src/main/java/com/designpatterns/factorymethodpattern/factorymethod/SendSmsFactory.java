package com.designpatterns.factorymethodpattern.factorymethod;

import com.designpatterns.factorymethodpattern.sender.Sender;
import com.designpatterns.factorymethodpattern.sender.SmsSender;

public class SendSmsFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
