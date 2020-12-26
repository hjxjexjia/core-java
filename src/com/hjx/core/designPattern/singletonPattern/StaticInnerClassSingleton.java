package com.hjx.core.designPattern.singletonPattern;

/**
 * @author hjxjexjia
 * @version 1.0
 * @description: create single
 * @date 2020/12/25 23:04
 */
public class StaticInnerClassSingleton {
    private static class SingletonHolder {
        private static final StaticInnerClassSingleton INSTANCE = new StaticInnerClassSingleton();
    }
    private StaticInnerClassSingleton (){}
    public static final StaticInnerClassSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
