package com.chenjun.oop.demo09接口;

// 抽象的思维

//interface定义的关键字，接口都需要有实现类
public interface UserService {
    //接口中的所有定义其实都是抽象的  public abstract
    void  run(String name);

    //属性默认是常量~public static final(不常用)
    int AGE = 99;


    void add(String name);//增
    void delete(String name);//删
    void update(String name);//改
    void query(String name);//查
}
