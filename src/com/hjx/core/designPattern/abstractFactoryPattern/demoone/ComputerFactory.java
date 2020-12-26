package com.hjx.core.designPattern.abstractFactoryPattern.demoone;

public class ComputerFactory extends AbstractFactory{
    @Override
    public Phone createPhone(String brand) {
        return null;
    }

    @Override
    public Computer createComputer(String brand) {
        if("HuaWei".equals(brand)){
            return new ComputerHuaWei();
        }else if("Apple".equals(brand)){
            return new ComputerApple();
        }else {
            return null;
        }
    }
}
