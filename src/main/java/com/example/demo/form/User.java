package com.example.demo.form;


//ユーザクラス
public class User {
 
    private String id;   // ID
    private String name; // ユーザ名
    private int age;     // 年齢
 
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}