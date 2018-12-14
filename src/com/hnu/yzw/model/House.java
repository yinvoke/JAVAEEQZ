package com.hnu.yzw.model;


/**
 * 实体类：House
 * 静态属性：
 *          u_id  主人id
 *          h_location  地址
 *          price   房子大小
 */
public class House {
    private int u_id;
    private String h_location;
    private String h_size;

    public House() {

    }
    public House(int u_id, String h_location, String h_size) {
        this.u_id = u_id;
        this.h_location = h_location;
        this.h_size = h_size;
    }

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public String getH_location() {
        return h_location;
    }

    public void setH_location(String h_location) {
        this.h_location = h_location;
    }

    public String getH_size() {
        return h_size;
    }

    public void setH_size(String h_size) {
        this.h_size = h_size;
    }
}
