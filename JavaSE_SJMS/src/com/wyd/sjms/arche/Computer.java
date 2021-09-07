package com.wyd.sjms.arche;

/**
 * @author WYD
 * @version 1.0
 * @description: 手写设计模式之-【原型模式】
 * @date 2021/9/7 14:11
 */
public class Computer /*implements Cloneable*/{
    String name;
    String type;


    public Computer clone() throws CloneNotSupportedException {
        Computer computer = new Computer();
        computer.name=name;
        computer.type=type;
        return computer;
//        return (Computer) super.clone();
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
