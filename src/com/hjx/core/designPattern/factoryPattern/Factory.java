package com.hjx.core.designPattern.factoryPattern;

public class Factory {
    public Phone createPhone(String phoneName){
        if("HuaWei".equals(phoneName)){
            return new HuaWei();
        }else if("Apple".equals(phoneName)){
            return new IPone();
        }else {
            return null;
        }
    }

    public static void main(String[] args){
        Factory factory = new Factory();
        Phone phone1 = factory.createPhone("HuaWei");
        System.out.println(phone1.brand());

        Phone phone2 = factory.createPhone("Apple");
        System.out.println(phone2.brand());
    }
}
