package com.hjx.core.designPattern.bridgePattern.demoone;

/**
 * @author hjxjexjia
 * @version 1.0
 * @description: TODO
 * @date 2020/12/26 9:52
 */
public class bridgePatternDemo {
    public static void main(String[] args){
        DriverManagerBridge driverManagerBridge = new MyDriverBridge();
        //设置Mysql驱动
        driverManagerBridge.setDriver(new MysqlDriver());
        driverManagerBridge.execute();

        //切换Oracle驱动
        driverManagerBridge.setDriver(new OracleDriver());
        driverManagerBridge.execute();
    }
}
