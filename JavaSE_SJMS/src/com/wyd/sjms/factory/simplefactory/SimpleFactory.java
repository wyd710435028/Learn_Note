package com.wyd.sjms.factory.simplefactory;

import com.wyd.sjms.factory.Apple;
import com.wyd.sjms.factory.Fruit;
import com.wyd.sjms.factory.Pear;
import com.wyd.sjms.factory.Water;

/**
 * @author WYD
 * @version 1.0
 * @description: TODO
 * @date 2021/9/6 17:18
 */
public class SimpleFactory {

    public static Fruit create(String type){
        switch (type){
            case "apple" : return new Apple(new Water());
            case "pear" : return new Pear();
            default:throw new IllegalArgumentException("无这种水果");
        }
    }
}
