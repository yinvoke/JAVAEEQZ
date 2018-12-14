package com.hnu.yzw.model;

/**
 * 实体类：OM（用于拓展功能辅助）
 * 静态属性：
 *          uid  主人id
 *          uname  姓名
 *          upwd   密码
 *          usex     性别
 *          uage     年龄
 *          uqq      qq号
 *          wname   工作
 *          uwsalary    工资
 *          uhlocation  地址
 *          uhsize  房子大小
 *          ucanme  车型
 *          uprice  车价格
 *
 */
public class OM {
    private int uid;
    private String uname;
    private String usex;
    private int uage;
    private String uqq;
    private String uwname;
    private double uwsalary;
    private String uhlocation;
    private double uhsize;
    private String ucname;
    private double ucprice;

    public OM() {
    }

    public OM(int uid, String uname, String usex, int uage, String uqq, String uwname, double uwsalary, String uhlocation, double uhsize, String ucname, double ucprice) {
        this.uid = uid;
        this.uname = uname;
        this.usex = usex;
        this.uage = uage;
        this.uqq = uqq;
        this.uwname = uwname;
        this.uwsalary = uwsalary;
        this.uhlocation = uhlocation;
        this.uhsize = uhsize;
        this.ucname = ucname;
        this.ucprice = ucprice;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUsex() {
        return usex;
    }

    public void setUsex(String usex) {
        this.usex = usex;
    }

    public int getUage() {
        return uage;
    }

    public void setUage(int uage) {
        this.uage = uage;
    }

    public String getUqq() {
        return uqq;
    }

    public void setUqq(String uqq) {
        this.uqq = uqq;
    }

    public String getUwname() {
        return uwname;
    }

    public void setUwname(String uwname) {
        this.uwname = uwname;
    }

    public double getUwsalary() {
        return uwsalary;
    }

    public void setUwsalary(double uwsalary) {
        this.uwsalary = uwsalary;
    }

    public String getUhlocation() {
        return uhlocation;
    }

    public void setUhlocation(String uhlocation) {
        this.uhlocation = uhlocation;
    }

    public double getUhsize() {
        return uhsize;
    }

    public void setUhsize(double uhsize) {
        this.uhsize = uhsize;
    }

    public String getUcname() {
        return ucname;
    }

    public void setUcname(String ucname) {
        this.ucname = ucname;
    }

    public double getUcprice() {
        return ucprice;
    }

    public void setUcprice(double ucprice) {
        this.ucprice = ucprice;
    }
}
