package com.wyd.genericity;

/**
 * @author WYD
 * @version 1.0
 * @description: 泛型接口实现类
 * @date 2021/8/24 16:40
 */
public class GenericityDemo2_Impl<T> implements GenericityDemo2<T>{
    private  T value;

    GenericityDemo2_Impl(T value){
        this.setValue(value);
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public T getValue() {
        return this.value;
    }
}

class GenericityDemo2_Impl_Main{
    public static void main(String[] args) {
        GenericityDemo2 genericityDemo2 =new GenericityDemo2_Impl(12020011);//构造方法调用set方法给属性赋值
        System.out.println(genericityDemo2.getValue());//获取给属性赋的值
    }
}
