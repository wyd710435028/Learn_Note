package com.wyd.sjms.build;

/**
 * @author WYD
 * @version 1.0
 * @description: 手写设计模式之-【建造者模式】
 * 建造者模式使用场景:当一个类的构造函数参数个数超过4个，而且这些参数有些是可选的参数，考虑使用构造者模式
 *                需要创建复杂对象,对象属性较多,并且有些是可选的。
 * 创建简单的对象使用工厂模式即可
 * @date 2021/9/7 10:09
 */
public class MilkTea implements Cloneable{ //以制作珍珠奶茶为例
    private  String type;
    private  String size;
    private  boolean pearl; //是否加珍珠
    private  boolean ice; //是否加冰

    private MilkTea(Builder builder){
        this.type=builder.type;
        this.size=builder.size;
        this.pearl=builder.pearl;
        this.ice=builder.ice;
    }

    public String getType() {
        return type;
    }

    public String getSize() {
        return size;
    }

    public boolean isPearl() {
        return pearl;
    }

    public boolean isIce() {
        return ice;
    }

    public static class Builder{
        private  String type;
        private  String size="中杯";
        private  boolean pearl=true; //是否加珍珠
        private  boolean ice=false; //是否加冰

        public Builder(String type) {
            this.type = type;
        }

        public Builder size(String size){
            this.size=size;
            return this;
        }

        public Builder pearl(boolean pearl){
            this.pearl = pearl;
            return this;
        }

        public Builder ice(boolean ice){
            this.ice = ice;
            return this;
        }

        public MilkTea build(){
            return new MilkTea(this);
        }
    }

    /**
     * 如何实现?
     * 在Computer 中创建一个静态内部类 Builder，然后将Computer 中的参数都复制到Builder类中。
     * 在Computer中创建一个private的构造函数，参数为Builder类型
     * 在Builder中创建一个public的构造函数，参数为Computer中必填的那些参数，cpu 和ram。
     * 在Builder中创建设置函数，对Computer中那些可选参数进行赋值，返回值为Builder类型的实例
     * 在Builder中创建一个build()方法，在其中构建Computer的实例并返回
    */

}
