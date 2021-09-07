package com.wyd.sjms.singleton;

/**
 * @author WYD
 * @version 1.0
 * @description: 手写设计模式之-单例模式【懒汉式】
 * 懒汉式：不在变量声明时产生实例,而是声明一个变量,在需要的时候生成实例
 * @date 2021/9/6 18:13
 */
public class LazySingleton {
    //构造器私有
    private LazySingleton(){
    }

    //初始化遍历为空
    private static LazySingleton lazySingleton = null;

    //如果实例为空则创建,否则不创建
//    public LazySingleton getLazySingleton(){
//        if (lazySingleton==null){//线程不安全,多线程环境下会导致多个线程执行判空语句
//            lazySingleton=new LazySingleton();
//        }
//        return lazySingleton;
//    }
    //问题:这样的懒汉式单例模式是线程不安全的,因为如果多线程操作会有多个线程同时执行到判空语句,从而不是单例
    //解决:加锁
//    public LazySingleton getLazySingleton(){
//        synchronized (LazySingleton.class){//加同步对象锁,每次只允许一个线程进入判断,但是会导致性能下降
//            if (lazySingleton==null){//加了锁,线程安全
//                lazySingleton=new LazySingleton();
//            }
//        }
//        return lazySingleton;
//    }

    //为了提高性能的同时保证线程安全: 双检锁方式
    public LazySingleton getLazySingleton(){
        if (lazySingleton==null){//增加一重校验,如果为空,让一个线程进入并创建对象
            synchronized (LazySingleton.class){
                if (lazySingleton==null){
                    lazySingleton=new LazySingleton();
                }
            }
        }
        return lazySingleton;
    }
}
