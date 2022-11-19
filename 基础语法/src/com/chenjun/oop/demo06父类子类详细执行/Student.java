package com.chenjun.oop.demo06父类子类详细执行;

public class Student extends Person{
//    @Override
    public void run() {
        System.out.println("son");
    }

    public void  eat(){
        System.out.println("eat");
    }
    //==============================
    public void go(){
        System.out.println("go");
    }
}

/*
public static void main(String[] args) {


       // 总结：
        //System.out.println(X instanceof Y);
//
  //      是否能够编译通过，取决于XY之间是否存在父子关系


    //Object > String
    //Object > Person > Teacher
    //Object > Person > Student
    Object object = new Student();


        System.out.println(object instanceof Student);//ture
                System.out.println(object instanceof Person);//ture
                System.out.println(object instanceof Object);//ture
                System.out.println(object instanceof Teacher);//false
                System.out.println(object instanceof String);//false
                System.out.println("==========================");
                Person person = new Student();
                System.out.println(person instanceof Student);//ture
                System.out.println(person instanceof Person);//ture
                System.out.println(person instanceof Object);//ture
                System.out.println(person instanceof Teacher);//false
//        System.out.println(person instanceof String);//编译报错
                Student student = new Student();

                System.out.println("==========================");
                System.out.println(student instanceof Student);//ture
                System.out.println(student instanceof Person);//ture
                System.out.println(student instanceof Object);//ture
//        System.out.println(student instanceof Teacher);//编译报错
//        System.out.println(student instanceof String);//编译报错
                }
 */
//=================================
/*
public static void main(String[] args) {
        //类型之间的转化：父类   子类
        //高                     低
        Person obj = new Student();
        //student将这个对象转换为Student类型，我们就可以使用Student类型的方法了
        Student student = (Student)obj;
        student.go();//1.
        ((Student) obj).go();//2.
    }
 */
//=================================
/*
public static void main(String[] args) {
        Student student = new Student();
        student.go();

        //子类转父类，可能丢失自己的方法
        Person person = student;
        //person.go;//无法编译
    }
 */
/*
1.父类的引用指向子类的对象
2.把子类转换为父类，向上转型；
3.把父类转换为子类，向下转型：强制转换
4.方便方法的调用，减少重复的代码，简洁


抽象：封装、继承、多态    抽象类、接口
 */