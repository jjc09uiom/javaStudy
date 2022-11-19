package com.chenjun.www.method;

public class Demo04 {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("args["+i+"]:"+args[i]);
        }
    }

    //命令行传参：在包文件夹下执行cmd，经过javac编译后，再用java命令运行，在具体类名地址后传入任意的字符串，即可在运行时实现输出
}
