package com.pattern.observer;

//具体观察者
public class WeixinUser implements Observer{
    private String username;
    public WeixinUser(String username){
        this.username = username;
    }
    @Override
    public void update(String message) {
        System.out.println(username+"----"+message);

    }
}
