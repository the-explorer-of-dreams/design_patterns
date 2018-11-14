package com.designpatterns.factorymethodpattern.factorymethod;

import com.designpatterns.factorymethodpattern.sender.Sender;

public interface Provider {
    public Sender produce();
}
