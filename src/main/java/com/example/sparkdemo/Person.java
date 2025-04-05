package com.example.sparkdemo;

import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private int age;

    // 一定要有无参构造函数
    public Person() {}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter 和 Setter 必须有！
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
}