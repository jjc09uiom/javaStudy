package com.chenjun.oop.demo05继承_派生;
//学生是人：派生类/子类
//子类继承了父类，就会拥有父类的全部方法
public class Student extends Person{    //ctr+H查看继承结构
    //extends ---->继承

    //========================

    public Student() {
        //隐藏代码：调用了父类的无参构造
        //显式定义：super();（必须放在子类构造器的第一行）
        System.out.println("Student无参构造执行了");
    }

    private String name = "jjc";
    public void test(String name){
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);//this指当前所在类，super指父类
    }

    public void  print(){
        System.out.println("Student");
    }
    public void test1(){
        print();
        this.print();
        super.print();
    }
}

/*
public static void main(String[] args) {
        Student student = new Student();
//        student.test("陈钧");
//        student.test1();
    }
 */
