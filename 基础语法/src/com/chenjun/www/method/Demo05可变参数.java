package com.chenjun.www.method;

public class Demo05可变参数 {
    public static void main(String[] args) {
        /*
        可变参数/不定项参数
        在声明方法时，在指定参数类型后加一个省略号
        一个方法只能指定一个可变参数，且必须是方法的最后一个参数，任何普通参数必须在它之前声明
         */
        Demo05可变参数 demo05 = new Demo05可变参数();
        demo05.test(1,2,3,4,5);

    }
    public void test(int... i){
        System.out.println(i[0]);
        System.out.println(i[1]);
        System.out.println(i[2]);
        System.out.println(i[3]);
        System.out.println(i[4]);
    }
}
