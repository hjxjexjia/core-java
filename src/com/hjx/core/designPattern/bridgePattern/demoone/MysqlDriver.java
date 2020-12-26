package com.hjx.core.designPattern.bridgePattern.demoone;

/**
 * @author hjxjexjia
 * @version 1.0
 * @description: TODO
 * @date 2020/12/26 9:45
 */
public class MysqlDriver implements Driver{
    @Override
    public void executeSQL() {
        System.out.println("execute sql by mysql driver");
    }
}
