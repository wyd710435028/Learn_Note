package com.wyd.sjms.singleton;

/**
 * @author WYD
 * @version 1.0
 * @description: 手写设计模式之-单例模式【饿汉式】
 * 单例模式：保证全局只有一个实例,不会改变
 * 优点：1.避免重复创建实例,节约空间提升效率
 *      2.避免操作多个实例导致逻辑错误
 * 饿汉式单例：每次变量声明都会初始化
 * @date 2021/9/6 18:03
 */
public class HungrySingleton {
    //实现
    //避免多个实例,就需要设置构造器私有,防止new出不同的对象
    private HungrySingleton(){
    }
    //变量声明都会初始化,就需要设置为静态的
    private static HungrySingleton hungrySingleton = new HungrySingleton(); //导致一个弊端,即使实例不使用也会创建一个实例

    //设置get方法作为获取实例的唯一入口
    public static HungrySingleton getHungrySingleton() {
        return hungrySingleton;
    }
}
