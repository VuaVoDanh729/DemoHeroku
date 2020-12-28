package com.codelearn.demo.entity;
import java.io.Serializable;
public class Student implements Serializable {
    public int ID;
    public String full_name;
    public String class_room;
    public String address;
    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public String getFull_name() {
        return full_name;
    }
    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }
    public String getClass_room() {
        return class_room;
    }
    public void setClass_room(String class_room) {
        this.class_room = class_room;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public Student() {
    }
    public Student(int ID, String full_name, String class_room, String address) {
        this.ID = ID;
        this.full_name = full_name;
        this.class_room = class_room;
        this.address = address;
    }
}
