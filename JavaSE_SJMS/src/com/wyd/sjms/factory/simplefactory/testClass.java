package com.wyd.sjms.factory.simplefactory;

import com.wyd.sjms.factory.Apple;
import com.wyd.sjms.factory.Fruit;
import com.wyd.sjms.factory.Pear;

/**
 * @author WYD
 * @version 1.0
 * @description: 手写设计模式-构建型设计模式之【工厂模式】:封装对象构建过程
 *
 * @date 2021/9/6 17:04
 */
public class testClass {
    public static void main(String[] args) {
        //不使用设计模式,创建苹果和梨的对象
        Apple apple = new Apple();//new 1次
        System.out.println(apple);

        Pear pear = new Pear();// new 1次
        System.out.println(pear);
        //问题: 耦合性高
        //解决: 使用工厂模式,将new的动作交给工厂处理
        //1.简单工厂:实现了解耦.
        Fruit apple1 = SimpleFactory.create("apple");
        Fruit pear1 = SimpleFactory.create("pear");
        System.out.println(apple1);
        System.out.println(pear1);
        // 存在问题:
        // - 修改每一个对象的创建都要修改同一个工厂,违背了单一职责原则
        // - 如果工厂要增加对新的对象的创建支持,则又需要修改工厂,这又违背了开闭原则
        // 解决: 为每一个对象的创建单独创建工厂

        Fruit apple2 = AppleFactory.create();
        Fruit pear2 = PearFactory.create();
        System.out.println(apple2);
        System.out.println(pear2);
        // - 如果要修改苹果工厂中对象的创建方式,只需修改苹果工厂即可,符合了单一职责原则
        // - 如果要新增加其他水果的对象创建,只需增加相应工厂即可,不会修改已有的工厂,也符合开闭原则
        // 还可继续优化,面向接口编程
        AbstractFactory abstractFactory1 = new AppleFactory(); //多态
        Fruit fruit1 = abstractFactory1.createFruit();
        AbstractFactory abstractFactory2 = new PearFactory(); //多态
        Fruit fruit2 = abstractFactory2.createFruit();
        System.out.println(fruit1);
        System.out.println(fruit2);
    }
}


