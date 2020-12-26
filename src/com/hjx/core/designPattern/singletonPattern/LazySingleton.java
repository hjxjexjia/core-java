package com.hjx.core.designPattern.singletonPattern;

/**
 * 懒汉式
 */
public class LazySingleton {
    private static LazySingleton instance;
    private LazySingleton(){}
    public static synchronized LazySingleton getInstance(){
        if(null == instance){
            instance = new LazySingleton();
        }
        return instance;
    }
}
