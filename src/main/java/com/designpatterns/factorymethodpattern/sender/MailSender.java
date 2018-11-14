package com.designpatterns.factorymethodpattern.sender;

public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is mailsender!");
    }
}
