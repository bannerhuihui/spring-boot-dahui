package com.it.huihui.bean;

/**
 * @program: workBefor
 * @description: 用户
 * @author: Mr.Yuan
 * @create: 2021-05-03 03:54
 **/
public class User {

    private int id;
    private String name;
    private String phone;
    private int sex;
    private int state;
    private String desc;
    private Long createTime;
    private Long updateTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User(int id, String name, String phone, int sex, int state, String desc, Long createTime, Long updateTime) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.sex = sex;
        this.state = state;
        this.desc = desc;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }
}
