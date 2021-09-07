package com.wyd.annotation;

import java.io.FileNotFoundException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @author WYD
 * @version 1.0
 * @description: 自定义注解
 * @date 2021/8/25 14:05
 */
public class TestMyCustomMethodAnnotation {

    @Override
    @MyCustomMethodAnnotation(title = "toString方法",desc = "Override注解")
    public String toString(){
        return "Override toString method";
    }

    @Deprecated
    @MyCustomMethodAnnotation(title = "oldMethod方法",desc = "Deprecated注解-表示弃用")
    public static void oldMethod() {
        System.out.println("old method, don't use it.");
    }

    @SuppressWarnings({"unchecked", "deprecation"})
    @MyCustomMethodAnnotation(title = "testMethod方法",desc = "suppress warning static method-抑制警告")
    public static void genericsTest() throws FileNotFoundException {
        List l = new ArrayList();
        l.add("abc");
        oldMethod();
    }

    public static void main(String[] args) {
        try {
            //获取TestMyCustomMethodAnnotation类下的所有方法
            Method[] methods = TestMyCustomMethodAnnotation.class.getClassLoader().loadClass("com.wyd.annotation.TestMyCustomMethodAnnotation").getMethods();
            //遍历
            for (Method method:methods){
                //判断方法上是否有@MyCustomMethodAnnotation注解
                if (method.isAnnotationPresent(MyCustomMethodAnnotation.class)){
                    for (Annotation annotation:method.getDeclaredAnnotations()){
                        System.out.println("方法名:"+method+","+"注解:"+annotation);
                    }
                    MyCustomMethodAnnotation myCustomMethodAnnotation = method.getAnnotation(MyCustomMethodAnnotation.class);
                    System.out.println(myCustomMethodAnnotation.title());
                    System.out.println(myCustomMethodAnnotation.desc());
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
