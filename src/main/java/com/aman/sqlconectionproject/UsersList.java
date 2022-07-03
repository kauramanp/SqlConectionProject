/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aman.sqlconectionproject;

/**
 *
 * @author HP
 */
public class UsersList {

    //Creating properties of the class  
    private String sclass;
    private String name;
    private int rollno;

    public UsersList() {
    }

    public UsersList(String name, String sClass, int rollno) {
        this.name = name;
        this.sclass = sClass;
        this.rollno = rollno;
    }

    public String getSclass() {
        return sclass;
    }

    public void setSclass(String sclass) {
        this.sclass = sclass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

}
