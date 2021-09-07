package com.wyd.sjms.factory.simplefactory;

import com.wyd.sjms.factory.Apple;
import com.wyd.sjms.factory.Fruit;

/**
 * @author WYD
 * @version 1.0
 * @description: 普通工厂模式
 * @date 2021/9/6 17:39
 */
public class AppleFactory implements AbstractFactory {

    public static Fruit create(){
        return new Apple();
    }

    @Override
    public Fruit createFruit() {
        return new Apple();
    }
}
