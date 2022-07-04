/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aman.sqlconectionproject;

/**
 *
 * @author HP
 */
public class Users {

    //Creating properties of the class 
    private int id;
    private String sclass;
    private String name;
    private int rollno;

    
    public Users() {
    }
    

    public Users(int id,String name, String sClass, int rollno) {
        this.id = id;
        this.name = name;
        this.sclass = sClass;
        this.rollno = rollno;
    }

    public Users(String name, String sClass, int rollno) {
        this.name = name;
        this.sclass = sClass;
        this.rollno = rollno;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
