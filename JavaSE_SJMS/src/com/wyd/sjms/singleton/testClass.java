package com.wyd.sjms.singleton;

/**
 * @author WYD
 * @version 1.0
 * @description: TODO
 * @date 2021/9/6 18:15
 */
public class testClass {
    public static void main(String[] args) {
        HungrySingleton hungrySingleton1 = HungrySingleton.getHungrySingleton();
        HungrySingleton hungrySingleton2 =HungrySingleton.getHungrySingleton();
        System.out.println(hungrySingleton1==hungrySingleton2);//true 说明是单例的
    }
}
