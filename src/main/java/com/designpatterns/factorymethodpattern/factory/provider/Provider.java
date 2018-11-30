package com.designpatterns.factorymethodpattern.factory.provider;

import com.designpatterns.factorymethodpattern.ware.sender.Sender;

public interface Provider {
    public Sender produce();
}
