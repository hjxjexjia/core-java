package com.hjx.core.designPattern.flyweightPattern.demoone;

import java.util.HashMap;

/**
 * @author hjxjexjia
 * @version 1.0
 * @description: TODO
 * @date 2020/12/26 10:20
 */
public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle)circleMap.get(color);

        if(circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}
