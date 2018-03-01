package com.pattern.observer;

import java.util.ArrayList;
import java.util.List;

//具体被观察者，微信公众号
public class SubscriptionSubject implements Subject{
    //储存订阅公众号的微信用户
    private List<Observer> weinxinUserList  = new ArrayList<Observer>();

    @Override
    public void attach(Observer observer) {
        weinxinUserList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        weinxinUserList.remove(observer);
    }

    @Override
    public void notify(String message) {
        for(Observer observer : weinxinUserList){
            observer.update(message);
        }

    }
}
