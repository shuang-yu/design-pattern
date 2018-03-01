package com.pattern.singleton;

/**
 * 内部类创建实例，维护实例.
 * 使用内部类的方式维护实例，既保证类懒加载的方式，还不用使用synchronized关键字，是一种比较完善的方式。
 */
public class LazyLoadHolderSingleton {
    private LazyLoadHolderSingleton(){

    }
    public static LazyLoadHolderSingleton getInstance(){
        return SingletonHolder.singleton;
    }
    public static class SingletonHolder{
        private final static LazyLoadHolderSingleton singleton = new LazyLoadHolderSingleton();
    }

}
