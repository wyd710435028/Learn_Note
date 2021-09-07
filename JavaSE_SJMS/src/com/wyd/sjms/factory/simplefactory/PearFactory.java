package com.wyd.sjms.factory.simplefactory;

import com.wyd.sjms.factory.Fruit;
import com.wyd.sjms.factory.Pear;

/**
 * @author WYD
 * @version 1.0
 * @description: 普通工厂模式
 * @date 2021/9/6 17:40
 */
public class PearFactory implements AbstractFactory {

    public static Fruit create(){
        return new Pear();
    }

    @Override
    public Fruit createFruit() {
        return new Pear();
    }
}
