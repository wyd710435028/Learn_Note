package com.wyd.genericity;

/**
 * @author WYD
 * @version 1.0
 * @description: 泛型方法
 * @date 2021/8/24 18:10
 */
public class GenericityDemo3 {

    public <T> T getObject(Class<T> c) throws IllegalAccessException, InstantiationException {
        //创建泛型对象
        T t = c.newInstance();
        return t;
    }

}

class User {
    private String name;
    private String sex;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

class GenericityDemo3_main{
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        GenericityDemo3 g=new GenericityDemo3();
        //调用泛型方法
        Object object = g.getObject(Class.forName("com.wyd.genericity.User"));
        System.out.println(object); //com.wyd.genericity.User@1b6d3586
    }
}
