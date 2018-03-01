package com.pattern.observer;

public class Client {
    public static void main(String [] args){
        SubscriptionSubject subscriptionSubject = new SubscriptionSubject();
        WeixinUser user1 = new WeixinUser("zhangsan");
        WeixinUser user2 = new WeixinUser("lisi");
        WeixinUser user3 = new WeixinUser("wangwu");
        subscriptionSubject.attach(user1);
        subscriptionSubject.attach(user2);
        subscriptionSubject.attach(user3);
        subscriptionSubject.notify("zhangsan 的专栏更新了");

    }



}
