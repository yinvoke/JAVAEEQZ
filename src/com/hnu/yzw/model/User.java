package com.hnu.yzw.model;



/**
 * 实体类：Users
 * 静态属性：
 *          u_id  主人id
 *          u_name  姓名
 *          u_pwd   密码
 *          sex     性别
 *          age     年龄
 *          qq      qq号
 *          w_name  工作
 */
public class User {
    private int u_id;
    private String u_name;
    private String u_pwd;
    private String sex;
    private int age;
    private String qq;
    private String w_name;

    public User() {
    }

    public User(int u_id, String u_name, String u_pwd) {
        this.u_id = u_id;
        this.u_name = u_name;
        this.u_pwd = u_pwd;
    }

    public User(int u_id, String u_name, String u_pwd, String sex, int age, String qq, String w_name) {
        this.u_id = u_id;
        this.u_name = u_name;
        this.u_pwd = u_pwd;
        this.sex = sex;
        this.age = age;
        this.qq = qq;
        this.w_name = w_name;
    }

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public String getU_name() {
        return u_name;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    public String getU_pwd() {
        return u_pwd;
    }

    public void setU_pwd(String u_pwd) {
        this.u_pwd = u_pwd;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getW_name() {
        return w_name;
    }

    public void setW_name(String w_name) {
        this.w_name = w_name;
    }
}
