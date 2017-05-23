package com.xiaoxin.bean;

/**
 * Created by xiaoxin on 2017/5/11.
 */
public class Teacher {
    private String name;
    private int id;

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
