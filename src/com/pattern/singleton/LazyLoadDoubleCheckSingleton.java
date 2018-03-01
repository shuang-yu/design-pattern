package com.pattern.singleton;

/**
 * 双端锁机制
 */
public class LazyLoadDoubleCheckSingleton {
    private static volatile LazyLoadDoubleCheckSingleton instance = null;
    private LazyLoadDoubleCheckSingleton(){

    }
    public static LazyLoadDoubleCheckSingleton getInstance(){
        //第一次检查
        if(instance == null){
            synchronized ((LazyLoadDoubleCheckSingleton.class)){
                //第二次检查
                if(instance == null){
                    instance = new LazyLoadDoubleCheckSingleton();
                }
            }
        }
        return instance;

    }

}
