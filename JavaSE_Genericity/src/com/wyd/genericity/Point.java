package com.wyd.genericity;

/**
 * @author WYD
 * @version 1.0
 * @description: 泛型类
 * @date 2021/8/24 16:18
 */

public class Point<T> { // 此处可以随便写标识符号，T是type的简称
    private T var ;     // var的类型由T指定，即：由外部指定
    public T getVar(){  // 返回值的类型由外部决定
        return var ;
    }
    public void setVar(T var){  // 设置的类型也由外部决定
        this.var = var ;
    }
}

class People<K,V> { // 此处指定了两个泛型类型
    private K key; // 此变量的类型由外部决定
    public V value; // 此变量的类型由外部决定

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "People{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}

class GenericityDemo1{
    public static void main(String[] args) {

        Point<String> stringPoint = new Point<>();
        stringPoint.setVar("zs");
        System.out.println(stringPoint.getVar());

        People<String,Integer> people = new People<>();// 定义两个泛型类型的对象,里面的key为String，value为Integer
        people.setKey("张三");// 设置第一个内容
        people.setValue(20);// 设置第二个内容
        System.out.println("姓名:"+people.getKey()+",年龄:"+people.getValue());
        People<String, Boolean> people1 = new People<>();
        people1.setKey("张三");
        people1.setValue(false);
        System.out.println("姓名:"+people1.getKey()+",婚否:"+people1.getValue());
    }
}


