package com.wyd.sjms.build;

/**
 * @author WYD
 * @version 1.0
 * @description: 用户类:操作奶茶
 * @date 2021/9/7 11:29
 */
public class User {
    //制作奶茶
    public void makeMilkTea(){
        MilkTea milkTea = new MilkTea.Builder("原味").build();
        show(milkTea);
        MilkTea coffeeMilkTea = new MilkTea.Builder("珍珠咖啡").ice(true).pearl(true).size("大杯").build();
        show(coffeeMilkTea);
    }

    private void show(MilkTea milkTea){
        String pearl;
        if (milkTea.isPearl()){
            pearl="加珍珠";
        }else {
            pearl="不加珍珠";
        }
        String ice;
        if (milkTea.isIce()){
            ice="加冰";
        }else {
            ice="不加冰";
        }
        System.out.println("制作了一份"+milkTea.getSize()+","+pearl+","+ice+"的"+milkTea.getType()+"奶茶");
    }
}
