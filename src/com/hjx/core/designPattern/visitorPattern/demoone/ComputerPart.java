package com.hjx.core.designPattern.visitorPattern.demoone;

/**
 * @author hjxjexjia
 * @version 1.0
 * @description: TODO
 * @date 2020/12/26 17:48
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
