package com.chenjun.oop.demo10更多;

public class Test {
    public static void main(String[] args) {
        //没有名字初始化类,不用将实例保存到变量中
        new Apple().eat();//匿名内部类


//UserService userService = new UserService
        new UserService(){

            @Override
            public void hello() {
                System.out.println("hello");
            }
        }.hello();  //使用接口方法


    }
}

class Apple{
    public void eat(){
        System.out.println("1");
    }
}

interface UserService{
        void hello();
}
