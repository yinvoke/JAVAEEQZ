package com.hnu.yzw.model;

/**
 * 实体类：Cars
 * 静态属性：
 *          u_id  主人id
 *          c_name  车型号
 *          price   车价格
 */


public class Car {
    private int u_id;
    private String c_name;
    private double price;

    public Car() {
    }

    public Car(int u_id, String c_name, double price) {
        this.u_id = u_id;
        this.c_name = c_name;
        this.price = price;
    }

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
