package com.hjx.core.designPattern.builderPattern;

/**
 * @author hjxjexjia
 * @version 1.0
 * @description: TODO
 * @date 2020/12/25 23:31
 */
public class Coke extends AbstractColdDrink {

    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}
