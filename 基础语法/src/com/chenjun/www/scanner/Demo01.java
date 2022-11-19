package com.chenjun.www.scanner;

import java.util.Scanner;//自动导入Scanner包

public class Demo01 {
    public static void main(String[] args) {
        //创建一个扫描器对象，用于接收键盘数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("使用next方式接收：");
        //判断用户有没有输入字符串hasNext()/hasNextLine()
        if(scanner.hasNext()){
            //使用next方式接收
            String str = scanner.next();//------->读取第一个单词
//            String str = scanner.nextLine();--------->读取一行输入
            System.out.println("输出的内容为："+str);
        }


//凡是属于IO流的类如果不关闭就会一直占用资源，用完及时关闭
        scanner.close();
    }
}
