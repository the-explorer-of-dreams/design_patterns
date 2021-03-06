package com.designpatterns.factorymethodpattern.simplefactorymethod;

import com.designpatterns.factorymethodpattern.ware.sender.MailSender;
import com.designpatterns.factorymethodpattern.ware.sender.Sender;
import com.designpatterns.factorymethodpattern.ware.sender.SmsSender;

public class SendFactoryByString {
    public Sender produce(String type){
        type = type.toLowerCase();
        if("mail".equals(type)){
            return new MailSender();
        }else if("sms".equals(type)){
            return new SmsSender();
        }else{
            System.out.println("请输入正确的类型！");
            return null;
        }

    }
}
