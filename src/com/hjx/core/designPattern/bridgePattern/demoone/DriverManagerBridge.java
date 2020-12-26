package com.hjx.core.designPattern.bridgePattern.demoone;

/**
 * @author hjxjexjia
 * @version 1.0
 * @description: TODO
 * @date 2020/12/26 9:48
 */
public abstract class DriverManagerBridge {
    private Driver driver;

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void execute(){
        this.driver.executeSQL();
    }
}
