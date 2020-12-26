package com.hjx.core.designPattern.observerPattern.demoone;

/**
 * @author hjxjexjia
 * @version 1.0
 * @description: TODO
 * @date 2020/12/26 11:07
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
