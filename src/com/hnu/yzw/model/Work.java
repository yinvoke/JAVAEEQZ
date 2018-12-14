package com.hnu.yzw.model;


/**
 * 实体类：Works
 * 静态属性：
 *          w_name  工作
 *          salary  工资
 */
public class Work {
    private String w_name;
    private double salary;

    public Work() {

    }

    public Work( String w_name, double salary) {
        this.w_name = w_name;
        this.salary = salary;
    }

    public String getW_name() {
        return w_name;
    }

    public void setW_name(String w_name) {
        this.w_name = w_name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
