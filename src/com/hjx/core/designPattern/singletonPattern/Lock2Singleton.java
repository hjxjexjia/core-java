package com.hjx.core.designPattern.singletonPattern;

/**
 * @author hjxjexjia
 * @version 1.0
 * @description: TODO
 * @date 2020/12/25 23:09
 */
public class Lock2Singleton {
    private volatile static Lock2Singleton singleton;
    private Lock2Singleton(){}
    private static Lock2Singleton getInstance(){
        if(singleton == null){
            synchronized (LazySingleton.class){
                if(singleton == null){
                    singleton = new Lock2Singleton();
                }
            }
        }
        return singleton;
    }
}
