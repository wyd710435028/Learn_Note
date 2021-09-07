package com.wyd.sjms.factory.simplefactory;

import com.wyd.sjms.factory.Fruit;

/**
 * @author WYD
 * @version 1.0
 * @description: 抽象工厂模式
 * @date 2021/9/6 17:47
 */
public interface AbstractFactory {
    Fruit createFruit();
}
