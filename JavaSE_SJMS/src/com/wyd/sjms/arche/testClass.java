package com.wyd.sjms.arche;

/**
 * @author WYD
 * @version 1.0
 * @description: 手写设计模式之-【原型模式】
 * 原型模式: 用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。
 *
 * @date 2021/9/7 14:13
 */
public class testClass {
    public static void main(String[] args) throws CloneNotSupportedException {
        Computer computer1 = new Computer();
        computer1.name="联想拯救者Y7000-2020";
        computer1.type="笔记本";
        Computer computer2 = computer1;//浅拷贝,拷贝地址
        System.out.println(computer1==computer2);//复制的是地址,而==比较的是地址,所以返回true
        System.out.println(computer1);
        //如果想要一个一模一样的笔记本电脑,怎么办?
        Computer computer3 = new Computer();
        computer3.name="联想拯救者Y7000-2020";//如果笔记本属性变了需要修改此处
        computer3.type="笔记本";

        //怎样能不修改呢?
        //解决
        Computer computer4 = computer1.clone();
        System.out.println(computer1==computer4);//false
        System.out.println(computer4);


    }

}
