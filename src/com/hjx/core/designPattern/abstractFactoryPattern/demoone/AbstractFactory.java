package com.hjx.core.designPattern.abstractFactoryPattern.demoone;

public abstract class AbstractFactory {
    public abstract Phone createPhone(String brand);
    public abstract Computer createComputer(String brand);
}
