package com.hjx.core.designPattern.singletonPattern;

/**
 * 饿汉式
 */
public class HungrySingleton {
    private static HungrySingleton instance = new HungrySingleton();
    private HungrySingleton(){}

    /**
     * @Author hjxjexjia
     * @Description //TODO
     * @Date 22:52 2020/12/25
     * @Param []
     * @return com.hjx.core.designPattern.singletonPattern.LazySingleton
     **/
    public static HungrySingleton getInstance(){
        return instance;
    }
}
