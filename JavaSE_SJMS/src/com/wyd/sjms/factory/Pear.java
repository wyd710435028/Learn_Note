package com.wyd.sjms.factory;

/**
 * @author WYD
 * @version 1.0
 * @description: TODO
 * @date 2021/9/6 17:14
 */
public class Pear extends Fruit{

    public Pear() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Pear{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
