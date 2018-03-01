package com.pattern.bridge;

public class Clienter {
    public static void main(String[] args){
        AreaA areaA = new AreaA1();
        areaA.fromAreaA();
        areaA.qiao = new AreaB3();
        areaA.qiao.targetAreaB();
    }
}
