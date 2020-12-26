package com.hjx.core.designPattern.abstractFactoryPattern.demoone;

public class AbstractFactoryDemo {
    public static void main(String[] args){
        AbstractFactory phoneFactory = new PhoneFactory();
        Phone huaweiPhone = phoneFactory.createPhone("HuaWei");
        Phone applePhone = phoneFactory.createPhone("Apple");
        System.out.println(huaweiPhone.call());
        System.out.println(applePhone.call());
        AbstractFactory computerFactory = new ComputerFactory();
        Computer huaweiComputer = computerFactory.createComputer("HuaWei");
        Computer appleComputer = computerFactory.createComputer("Apple");
        System.out.println(huaweiComputer.internet());
        System.out.println(appleComputer.internet());
    }

}
