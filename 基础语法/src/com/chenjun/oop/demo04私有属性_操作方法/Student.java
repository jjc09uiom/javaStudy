package com.chenjun.oop.demo04私有属性_操作方法;
//类
public class Student {

    //----->属性私有
    private String name;//名字
    private int id;//学号
    private char sex;  //性别
private int age;//年龄
    //----->提供一些可以操作这些属性的方法;
    //提供一些public的get、set方法

    //get  获得这些数据
    public String getName(){
        return this.name;
    }

    //set  给这些数据设置值
    public void setName(String name){
        this.name = name;
    }

    //alt+insert----->自动添加

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>120||age<0)
            this.age = 3;
        else
            this.age = age;
    }
}
/*
public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("陈钧");
        System.out.println(s1.getName());


        s1.setAge(999);
        System.out.println(s1.getAge());
    }
 */