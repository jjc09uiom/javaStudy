package com.chenjun.oop.demo01类基础;
//引用传递
public class Demo05 {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.name);//null
        Demo05.change(person);
        System.out.println(person.name);
    }
    public static void change(Person person){
        person.name = "陈钧";
    }

}
//定义了一个person类，有一个属性：name
class Person{
    String name;//默认值为null
}
