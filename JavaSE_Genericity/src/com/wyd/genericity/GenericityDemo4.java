package com.wyd.genericity;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author WYD
 * @version 1.0
 * @description: 泛型的上下限：为了解决泛型中的隐含转换的问题
 * @date 2021/8/25 9:30
 */

/**
 * ----总结----
 * <?> 无限制通配符
 * <? extends E> extends 关键字声明了类型的上界，表示参数化的类型可能是所指定的类型，或者是此类型的子类
 * <? super E> super 关键字声明了类型的下界，表示参数化的类型可能是指定的类型，或者是此类型的父类
 * Java在语法上支持泛型，但是在编译阶段会进行所谓的“类型擦除”（Type Erasure），将所有的泛型表示（尖括号中的内容）都替换为具体的类型（其对应的原生态类型）
 * @param <T>
 */
class UpperLimit<T extends Number>{//上限:规定只能传入Number和其子类的类型作为参数
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

class LowerLimit<T>{
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "LowerLimit{" +
                "value=" + value +
                '}';
    }
}

public class GenericityDemo4 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        UpperLimit<Integer> upperLimit = new UpperLimit<>();//上限对象
        UpperLimit<Float> floatUpperLimit = new UpperLimit<>();//上限对象
//        new UpperLimit<String>();//错误
        upperLimit.setValue(1);//1
        floatUpperLimit.setValue(1.5f);//1.5
        System.out.println(upperLimit.getValue());
        System.out.println(floatUpperLimit.getValue());

        LowerLimit<String> stringLowerLimit = new LowerLimit<>();//下限对象
        LowerLimit<Integer> integerLowerLimit = new LowerLimit<>();//下线对象
        LowerLimit<Object> objectLowerLimit = new LowerLimit<>();
        stringLowerLimit.setValue("zs");
        integerLowerLimit.setValue(1);
        objectLowerLimit.setValue(1.5);
        fun(stringLowerLimit);//zs
        fun(objectLowerLimit);//1
//        fun(integerLowerLimit);//报错

        List<?>[] list11 = new ArrayList<?>[10];//泛型数组

        //泛型中的类型擦除
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("ls");
        ArrayList<Integer> integers = new ArrayList<Integer>();
        integers.add(10);
        System.out.println(strings.getClass());//class java.util.ArrayList
        System.out.println(integers.getClass());//class java.util.ArrayList
        System.out.println(strings.getClass() == integers.getClass()); //true 说明在编译时将泛型的类型擦除了,变成了原始类型

        //通过反射添加其他类型元素
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(20);//正常添加integer类型
        //如果想添加String类型呢？ ——用反射
        integerArrayList.getClass().getMethod("add",Object.class).invoke(integerArrayList,"ww");
        for (int i=0;i<integerArrayList.size();i++){
            System.out.println(integerArrayList.get(i));
        }
    }
    public static void fun(LowerLimit<? super String> lowerLimit){//<? super String> 代表参数只能是String对象或者其父对象(Object)
        System.out.println(lowerLimit+",");
    }
}


class A{}
class B extends A {}
class testAB{
    // 如下两个方法不会报错
    public static void funA(A a) {
        // ...
    }
    public static void funB(B b) {
        funA(b);
        // ...
    }

    // 如下funD方法会报错
    public static void funC(List<A> listA) {
        // ...
    }
    public static void funD(List<B> listB) {//泛型中隐含的转换问题
        /**funC(listB);*/ // Unresolved compilation problem: The method doPrint(List<A>) in the type test is not applicable for the arguments (List<B>)
        // ...
    }
}


