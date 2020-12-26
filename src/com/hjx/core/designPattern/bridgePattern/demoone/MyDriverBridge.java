package com.hjx.core.designPattern.bridgePattern.demoone;

/**
 * @author hjxjexjia
 * @version 1.0
 * @description: TODO
 * @date 2020/12/26 9:50
 */
public class MyDriverBridge extends DriverManagerBridge{
    @Override
    public void execute() {
        getDriver().executeSQL();
    }

    public void query(){
        getDriver().executeSQL();
    }
}
